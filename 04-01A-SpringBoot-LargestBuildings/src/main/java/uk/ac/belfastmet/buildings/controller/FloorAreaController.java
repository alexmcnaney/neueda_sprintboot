package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.buildings.service.FloorAreaService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class FloorAreaController {
	
		//@Autowired
		private FloorAreaService floorAreaService;
		
	 
		
		@GetMapping("/")
		public String homePage(Model model) {
			
			return "homePage";
		}

		@GetMapping("/floorarea")
		public String floorarea(Model model) {
			model.addAttribute("pageTitle", "floor area!");
			this.floorAreaService = new FloorAreaService();
			model.addAttribute("largeFABuildings", this.floorAreaService.getfloorArea());
			return "floorAreaPage";
		}
	
	}


