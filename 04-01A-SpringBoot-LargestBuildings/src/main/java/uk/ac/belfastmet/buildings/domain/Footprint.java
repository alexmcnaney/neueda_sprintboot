package uk.ac.belfastmet.buildings.domain;

public class Footprint {

	
private String bnumber, name, country, place, footprint, image;
	
	public Footprint(String bnumber, String name, String country, String place, String footprint, String image) {
		
		this.bnumber = bnumber;
		this.name = name;
		this.country = country;
		this.place = place;
		this.footprint = footprint;
		this.image = image;
		
	}
	
	public Footprint() {
		
	}
	
	public String getBnumber() {
		return bnumber;
	}

	public void setBnumber(String bnumber) {
		this.bnumber = bnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
