package uk.ac.belfastmet.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Applicant {
	
	public Applicant() {
		super();
	}

	@Id
	@GeneratedValue
	private Integer applicantId;
	private String name;
	private String location, techtype;
	private Integer capacity;
	private String date;
	private double payment;
	
	public Applicant(Integer applicantId, String name, String location, String techtype, String date, Integer capacity, double payment) {
		this.name = name;
		this.location = location;
		this.techtype = techtype;
		this.capacity = capacity;
		this.date = date;
		this.payment = payment;
	}

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTechtype() {
		return techtype;
	}

	public void setTechtype(String techtype) {
		this.techtype = techtype;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	
	
}
