package uk.ac.belfastmet.cereal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {
	
	public Cereal() {
		super();
	}

	
	@Id
	@GeneratedValue
	private Integer cerealId;
	private String manufacturer, cereal;
	private Float energy, calories, protein, carbohydrate, sugars, fat, saturates, fibre, sodium, salt, iron;
	
	public Cereal(Integer cerealId, String manufacturer, String cereal, Float energy, Float calories, Float protein, Float carbohydrate, Float sugars, Float fat, Float saturates, Float fibre, Float sodium, Float salt, Float iron) {
		this.cerealId = cerealId;
		this.manufacturer = manufacturer;
		this.cereal = cereal;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
		
		
	}

	public Integer getCerealId() {
		return cerealId;
	}

	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCereal() {
		return cereal;
	}

	public void setCereal(String cereal) {
		this.cereal = cereal;
	}

	public Float getEnergy() {
		return energy;
	}

	public void setEnergy(Float energy) {
		this.energy = energy;
	}

	public Float getCalories() {
		return calories;
	}

	public void setCalories(Float calories) {
		this.calories = calories;
	}

	public Float getProtein() {
		return protein;
	}

	public void setProtein(Float protein) {
		this.protein = protein;
	}

	public Float getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Float carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Float getSugars() {
		return sugars;
	}

	public void setSugars(Float sugars) {
		this.sugars = sugars;
	}

	public Float getFat() {
		return fat;
	}

	public void setFat(Float fat) {
		this.fat = fat;
	}

	public Float getSaturates() {
		return saturates;
	}

	public void setSaturates(Float saturates) {
		this.saturates = saturates;
	}

	public Float getFibre() {
		return fibre;
	}

	public void setFibre(Float fibre) {
		this.fibre = fibre;
	}

	public Float getSodium() {
		return sodium;
	}

	public void setSodium(Float sodium) {
		this.sodium = sodium;
	}

	public Float getSalt() {
		return salt;
	}

	public void setSalt(Float salt) {
		this.salt = salt;
	}

	public Float getIron() {
		return iron;
	}

	public void setIron(Float iron) {
		this.iron = iron;
	}

}