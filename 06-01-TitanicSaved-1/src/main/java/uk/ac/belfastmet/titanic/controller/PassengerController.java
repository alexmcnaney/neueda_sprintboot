package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/")
public class PassengerController {
	
	
	@Autowired
	PassengerRepository passengerRepository;
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	

	@GetMapping("/passenger")
	public String passenger(Model model) {
		
			model.addAttribute("pageTitle", "Passenger!");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByOrderByName());
				
		
		return "passengersPage";
	}
	
	@GetMapping("/survivors")
	public String passengerSurvived(Model model) {
		
			model.addAttribute("pageTitle", "Surviors!");
			//name of table
			model.addAttribute("passengers", passengerRepository.findBySurvived(1));
				
		
		return "survivedPage";
	}
	
	@GetMapping("/parentchild")
	public String passengerClass(Model model) {
		
			model.addAttribute("pageTitle", "Parent & Child");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByParch(1));
				
		
		return "parchPage";
	}

	
	
}
