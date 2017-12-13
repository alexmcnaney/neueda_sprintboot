package uk.ac.belfastmet.titanic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity 
public class Passenger {

	public Passenger() {
		super();
	}
	
	
	@Id
	@GeneratedValue
	private Integer passengerId;
	private Integer survived, pclass, sib_sp, parch;
	@NotEmpty
	private String name;
	private String sex, embarked, ticket, cabin;
	private Float fare, age;
	
	
	public Passenger(Integer passengerId, Integer survived, Integer pclass, String name, Float age, Integer sib_sp, Integer parch, String ticket, Float fare, String embarked, String cabin) {
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.age = age;
		this.sib_sp = sib_sp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.embarked = embarked;
		this.cabin = cabin;
		
		
	}

	

	public Integer getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}


	public Integer getSurvived() {
		return survived;
	}


	public void setSurvived(Integer survived) {
		this.survived = survived;
	}


	public Integer getPclass() {
		return pclass;
	}


	public void setPclass(Integer pclass) {
		this.pclass = pclass;
	}


	


	public Integer getParch() {
		return parch;
	}


	public void setParch(Integer parch) {
		this.parch = parch;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getEmbarked() {
		return embarked;
	}


	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}


	public String getTicket() {
		return ticket;
	}


	public void setTicket(String ticket) {
		this.ticket = ticket;
	}


	public Float getFare() {
		return fare;
	}


	public void setFare(Float fare) {
		this.fare = fare;
	}


	public Float getAge() {
		return age;
	}


	public void setAge(Float age) {
		this.age = age;
	}
	
	public Integer getSib_sp() {
		return sib_sp;
	}



	public void setSib_sp(Integer sib_sp) {
		this.sib_sp = sib_sp;
	}
	public String getCabin() {
		return cabin;
	}


	public void setCabin(String cabin) {
		this.cabin = cabin;
	}


	
	
	
}
