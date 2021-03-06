package uk.ac.belfastmet.buildings.domain;

public class UsableVolume {
	
private String bnumber, name, country, place, usableVolume, image;
	
	public UsableVolume(String bnumber, String name, String country, String place, String usableVolume, String image) {
		
		this.bnumber = bnumber;
		this.name = name;
		this.country = country;
		this.place = place;
		this.usableVolume = usableVolume;
		this.image = image;
		
	}
	
	public UsableVolume() {
		
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


}
