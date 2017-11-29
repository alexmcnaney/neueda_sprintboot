package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

public class BuildingController {
	
	@Controller
	@RequestMapping("/")
	public class BuildingController {
		
		@Autowired
		private BuildingService buildingService;
		
	 
		
		@GetMapping("/")
		public String homePage(Model model) {
			
			return "homePage";
		}

		@GetMapping("/floorarea")
		public String disney(Model model) {
			model.addAttribute("pageTitle", "floor area!");
			this.buildingService = new BuildingService();
			model.addAttribute("buildings", this.buildingService.getfloorAreaBuilding());
			return "floorAreaPage";
		}
	
	}

}
