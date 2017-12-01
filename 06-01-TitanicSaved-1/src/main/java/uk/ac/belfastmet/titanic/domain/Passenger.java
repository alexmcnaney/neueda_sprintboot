package uk.ac.belfastmet.titanic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Passenger {

	public Passenger() {
		super();
	}
	
	
	@Id
	@GeneratedValue
	private Integer passengerId;
	private Integer survived, pclass, SibSp, parch;
	private String name, sex, embarked, ticket;
	private Float fare, age;
	
	
	public Passenger(Integer passengerId, Integer survived, Integer pclass, String name, Float age, Integer SibSp, Integer parch, String ticket, Float fare, String cabin, String embarked) {
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.age = age;
		this.SibSp = SibSp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.embarked = embarked;
		
		
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


	public Integer getSibSp() {
		return SibSp;
	}


	public void setSibSp(Integer sibSp) {
		SibSp = sibSp;
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


	
	
	
}
