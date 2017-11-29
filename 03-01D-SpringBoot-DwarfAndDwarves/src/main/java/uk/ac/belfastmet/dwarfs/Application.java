package uk.ac.belfastmet.dwarfs;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs() {
	
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
		Dwarf bomfur = new Dwarf("Bomfur", "Tolkien", "Bomfur.png");
		dwarfs.add(bomfur);
		
		
		System.out.println("Snow Whites seven dwarfs are: ");
		for (Dwarf dwarf: dwarfs) {
			if (dwarf.getAuthor().equals("Disney")){
				System.out.println("Name: " + dwarf.getName() + "\n" + "Author: " + dwarf.getAuthor() + " \n" + "File name:"  + dwarf.getImage());
			}
		}
			
			System.out.println("The company of Thorin: ");
			for (Dwarf dwarf: dwarfs) {
				if (dwarf.getAuthor().equals("Tolkien")){

					System.out.println("Name: " + dwarf.getName() + "\n" + "File name: "  + dwarf.getImage());
				}
			}
			
		}
}
