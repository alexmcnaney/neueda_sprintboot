package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.buildings.service.FloorAreaService;
import uk.ac.belfastmet.buildings.service.FootprintService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/footprint")
public class FootprintController {
	
		//@Autowired
		private FootprintService footprintService;
		


		@GetMapping("/")
		public String footprint(Model model) {
			model.addAttribute("pageTitle", "footprint!");
			this.footprintService = new FootprintService();
			model.addAttribute("largeFBuildings",
			this.footprintService.getfootprint());
			return "footprintPage";
		}
		
		

	
	}




