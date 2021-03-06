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
	
	@GetMapping("/firstclass")
	public String passengerFClass(Model model) {
		
			model.addAttribute("pageTitle", "First Class Passengers");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByPclass(1));
				
		
		return "fClassPage";
	}

	@GetMapping("/secondclass")
	public String passengerSClass(Model model) {
		
			model.addAttribute("pageTitle", "Second Class Passengers");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByPclass(2));
				
		
		return "sClassPage";
	}
	
	@GetMapping("/thirdclass")
	public String passengerTClass(Model model) {
		
			model.addAttribute("pageTitle", "Third Class Passengers");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByPclass(3));
				
		
		return "tClassPage";
	}
	@GetMapping("/age")
	public String passengerAge(Model model) {
		
			model.addAttribute("pageTitle", "Age");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByOrderByName());
				
		
		return "agePage";
	}
	
	
}
