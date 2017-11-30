package uk.ac.belfastmet.buildings.domain;

public class FloorArea {

	private String bnumber, name, country, place, floorArea, image;
	
	public FloorArea(String bnumber, String name, String country, String place, String floorArea, String image) {
		
		this.bnumber = bnumber;
		this.name = name;
		this.country = country;
		this.place = place;
		this.floorArea = floorArea;
		this.image = image;
		
	}
	
	public FloorArea() {
		
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

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
