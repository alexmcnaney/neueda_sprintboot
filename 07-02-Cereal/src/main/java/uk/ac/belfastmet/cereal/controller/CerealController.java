package uk.ac.belfastmet.cereal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.cereal.domain.Cereal;
import uk.ac.belfastmet.cereal.repository.CerealRepository;

@Controller
@RequestMapping("/")
public class CerealController {

	@Autowired
	CerealRepository cerealRepository;

	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;

	}

	@GetMapping("/")
	public String homePage(Model model) {

		return "homePage";
	}

	@GetMapping("/cereal")
	public String cereal(Model model) {

		model.addAttribute("pageTitle", "Breakfast Cereals!");
		// name of table
		model.addAttribute("cereals", cerealRepository.findByOrderByCerealId());

		return "cerealPage";
	}

	@GetMapping("/cereal/view/{cerealId}")
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model) {

		model.addAttribute("pageTitle", "{cerealName}");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "viewCerealPage";
	}

	@GetMapping("/cereal/edit/{cerealId}")
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {

		model.addAttribute("pageTitle", "Edit cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "editCerealPage";

	}

	@GetMapping("/cereal/delete/{cerealId}")

public String deleteCereal(@PathVariable("cerealId") Integer cerealId, 
			RedirectAttributes redirectAttrs) {
 		
 		cerealRepository.delete(cerealId);
		redirectAttrs.addFlashAttribute("message", "Cereal was deleted");
 		
 		return "redirect:/cereal";

}

	@GetMapping("/cereal/add")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("cereal", new Cereal());
		return "editCerealPage";
	}

	@PostMapping("/cereal/save")
	// the cereal must be valid (tags in cereal.java)
	// binding result checks if it is valid
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {

			return "editCerealPage";

		} else {

			Cereal savedCereal = cerealRepository.save(cereal);
			savedCereal.getCerealId();
			// redirecting user to the page with the new cereal id which was assigned by the
			// database
			return "redirect:/cereal/view/" + savedCereal.getCerealId();

		}

	}

}
