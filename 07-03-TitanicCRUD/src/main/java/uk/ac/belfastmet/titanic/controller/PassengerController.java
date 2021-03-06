package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import uk.ac.belfastmet.titanic.domain.Passenger;
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
		
			model.addAttribute("pageTitle", "Passenger Age");
			//name of table
			model.addAttribute("passengers", passengerRepository.findByOrderByAge());
				
		
		return "agePage";
	}
	
	@GetMapping("/history")
	public String titanicHistory(Model model) {
		
			model.addAttribute("pageTitle", "History");

				
		
		return "historyPage";
	}
	
	@GetMapping("/building")
	public String titanicBuilding(Model model) {
		
			model.addAttribute("pageTitle", "History");

				
		
		return "buildingPage";
	}
	
	
	@GetMapping("passenger/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "{passengerName}");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "viewPassengerPage";
	}

	@GetMapping("passenger/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "Edit passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "editPassengerPage";

	}

	@GetMapping("passenger/delete/{passengerId}")

public String deletePassenger(@PathVariable("passengerId") Integer passengerId, 
			RedirectAttributes redirectAttrs) {
 		
		passengerRepository.delete(passengerId);
		redirectAttrs.addFlashAttribute("message", "Passenger was deleted");
 		
 		return "redirect:/passenger";

}
	@GetMapping("/passenger/add")
	public String createPassenger(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("passenger", new Passenger());
		return "editPassengerPage";
	}
	@PostMapping("/passenger/save")

	// binding result checks if it is valid
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {

			return "editPassengerPage";

		} else {

			Passenger savedPassenger = passengerRepository.save(passenger);
			savedPassenger.getPassengerId();
		
			return "redirect:/passenger/view/" + savedPassenger.getPassengerId();
		}
		
	}
	
	
//	@PostMapping("passenger/search")
//	public String search(@RequestParam("searchField") String searchField,
//			@RequestParam("searchString") String searchString, Model model) {
//		
//		if (searchField.equals("name")){
//			
//			model.addAttribute("pageTitle", "Search Passengers");
//			model.addAttribute("passenger", passengerRepository.findByNameLike("%" + searchString + "%"));
//		
//	}else if (searchField.equals("embarked")) {
//		
//		model.addAttribute("pageTile", "Search Passengers");
//		model.addAttribute("passenger", passengerRepository.findByEmbarked(searchString));
//		
//	}else if(searchField.equals("passengerClass")) {
//		
//		Integer pClass = Integer.parseInt(searchString);
//		model.addAttribute("pageTitle", "Search Passengers");
//		model.addAttribute("passenger", passengerRepository.findByPclass(pClass));
//	}
//		return "passengersPage";		
//
//	}

	
	
}
