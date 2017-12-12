package uk.ac.belfastmet.cereal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	@GetMapping("/cereal/add")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("cereal", new Cereal());
		return "editCerealPage";
	}
	
	@PostMapping("/cereal/save")
	public String saveCereal(Cereal cereal) {
	
		Cereal savedCereal = cerealRepository.save(cereal);
		savedCereal.getCerealId();
		//redirecting user to the page with the new cereal id which was assigned by the database
		return "redirect:/cereal/view/" + savedCereal.getCerealId();
	}

			
		
	
	
}
