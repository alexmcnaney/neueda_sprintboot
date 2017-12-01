package uk.ac.belfastmet.buildings.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.buildings.service.UsableVolumeService;

@Controller
@RequestMapping("/usableVolume")
public class UsableVolumeController {
	
	//@Autowired
	private UsableVolumeService usableVolumeService;
	
	@GetMapping("/")
	public String usableVolume(Model model) {
		model.addAttribute("pageTitle", "Useable Volume!");
		this.usableVolumeService = new UsableVolumeService();
		model.addAttribute("largeUVBuildings",
		this.usableVolumeService.getuseableVolume());
		return "usableVolumePage";
	}
	
	
	
	
	








	

	}
