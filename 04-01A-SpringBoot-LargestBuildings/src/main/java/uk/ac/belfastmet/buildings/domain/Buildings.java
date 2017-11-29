package uk.ac.belfastmet.buildings.domain;

public class Buildings {

	
	private String bnumber, name, country, place, description;
	private String floorArea, footprint, usableVolume, image;
	
	
	public Buildings(String bnumber, String name, String country, String place, String description, String floorArea, String footprint, String usableVolume, String image) {
		
		this.bnumber=bnumber;
		this.name = name;
		this.country = country;
		this.place = place;
		this.description = description;
		this.floorArea = floorArea;
		this.footprint = footprint;
		this.usableVolume = usableVolume;
		this.image = image;
		
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getFloorArea() {
		return floorArea;
	}


	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}


	public String getFootprint() {
		return footprint;
	}


	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}


	public String getUsableVolume() {
		return usableVolume;
	}


	public void setUsableVolume(String usableVolume) {
		this.usableVolume = usableVolume;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	

	public Buildings() {
	
	}
	
	
}
