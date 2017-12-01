package uk.ac.belfastmet.titanic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	PassengerRepository passengerRepository;
	public HomeController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/")
	public String homePage(Model model) {
		
		return "homePage";
	}
	

}
