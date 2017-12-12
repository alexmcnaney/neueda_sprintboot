package uk.ac.belfastmet.cereal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.repository.CerealRepository;

@Controller
@RequestMapping("/")
public class CerealController {
	
	@Autowired
	CerealRepository  cerealRepository;
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
			//name of table
			model.addAttribute("cereal", cerealRepository.findByOrderByCerealId());
				
		
		return "cerealPage";
	}

}
