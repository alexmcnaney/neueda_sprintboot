package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class DisneyController {

	@GetMapping("/")
	public String disney(Model model) {
		
		return "disneyPage";
	}
	
	
	@GetMapping("/bingo")
	public String bingo(Model model) {
		
		return "There was a dog in our back yard...";
	}
	
	
	@GetMapping("/princess")
	public String princess(Model model) {
		
		return "Meghan Merkle";
	}
}
