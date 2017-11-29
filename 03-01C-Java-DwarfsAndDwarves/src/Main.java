import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "happy.png");
		dwarfs.add(happy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "dopey.png");
		dwarfs.add(dopey);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "bashful.png");
		dwarfs.add(bashful);
		Dwarf doc = new Dwarf("Doc", "Disney", "doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "grumpy.png");
		dwarfs.add(grumpy);
		
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
		dwarfs.add(thorin);
		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
		dwarfs.add(balin);
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
		dwarfs.add(dwalin);
		Dwarf fili = new Dwarf("Fili", "Tolkien", "fili.png");
		dwarfs.add(fili);
		Dwarf kili = new Dwarf("Kili", "Tolkien", "kili.png");
		dwarfs.add(kili);
		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
		dwarfs.add(dori);
		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
		dwarfs.add(nori);
		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
		dwarfs.add(ori);
		Dwarf oin = new Dwarf("Oin", "Tolkien", "oin.png");
		dwarfs.add(oin);
		Dwarf gloin= new Dwarf("Gloin", "Tolkien", "gloin.png");
		dwarfs.add(gloin);
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "bifur.png");
		dwarfs.add(bifur);
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
		dwarfs.add(bofur);
		Dwarf bomfur = new Dwarf("Bomfur", "Tolkien", "bomfur.png");
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

		
		
		