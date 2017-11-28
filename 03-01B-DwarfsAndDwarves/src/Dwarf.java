
public class Dwarf {

	private String name, author, image;
	
	
	public Dwarf(String name, String author, String image) {
		this.name = name;
		this.author = author;
		this.image = image;
			
	}
	
	public Dwarf() {
		
	}
	
	public void DisplayDwarf(){
		
		System.out.println("..." + name + "\n" + "..." + author);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
