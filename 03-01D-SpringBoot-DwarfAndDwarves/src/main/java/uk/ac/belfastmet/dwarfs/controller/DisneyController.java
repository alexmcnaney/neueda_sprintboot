package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.service.DwarfService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class DisneyController {
	
	@Autowired
	private DwarfService dwarfService;
	
 
	
	@GetMapping("/")
	public String homePage(Model model) {
		
		return "homePage";
	}

	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");
		return "disneyPage";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");
			return "tolkienPage";
	}
	
	
	
	
	public ArrayList<Dwarf> getDwarfs(){
		//function will return an array of dwarfs
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(happy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(dopey);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(sneezy);

		
		return dwarfs;
	}
	
	public ArrayList<Dwarf> getDwarves(){
		//function will return an array of dwarfs
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
	
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
		dwarfs.add(thorin);
		Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
		dwarfs.add(balin);
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
		dwarfs.add(dwalin);
		Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
		dwarfs.add(fili);
		Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
		dwarfs.add(kili);
		Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
		dwarfs.add(dori);
		Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		dwarfs.add(nori);
		Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		dwarfs.add(ori);
		Dwarf oin = new Dwarf("Oin", "Tolkien", "Oin.png");
		dwarfs.add(oin);
		Dwarf gloin= new Dwarf("Gloin", "Tolkien", "Gloin.png");
		dwarfs.add(gloin);
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
		dwarfs.add(bifur);
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
		dwarfs.add(bofur);
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
		dwarfs.add(bombur);
		
		return dwarfs;
	}
	

	
	//example only
	@GetMapping("/bingo")
	public String bingo(Model model) {
		
		return "There was a dog in our back yard...";
	}
	
	

}
