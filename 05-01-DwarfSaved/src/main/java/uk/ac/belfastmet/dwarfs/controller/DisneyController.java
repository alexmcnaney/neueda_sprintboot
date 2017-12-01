package uk.ac.belfastmet.dwarfs.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class DisneyController {
	 
	
	
	@Autowired
	DwarfRepository dwarfRepository;
	
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("/")
	public String homePage(Model model) {
		
		return "homePage";
	}
	

		@GetMapping("/disney")
		public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("dwarfs", dwarfRepository.findByOrderByName("Disney"));
			
			return "disneyPage";
		}
		
		@GetMapping("/tolkien")
		public String tolkien(Model model) {
			model.addAttribute("pageTitle", "Tolkien!");
			model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Tolkien"));

			return "tolkienPage";
		}
		
		
}
