package com.review.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Alien {
	@Id
private int sno;
	private String name;
	private String country;
	private int age;
	private int jno;
	private String team;
	private int runs;
	private int wickets;
public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public int getJno() {
	return jno;
}
public void setJno(int jno) {
	this.jno = jno;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public int getWickets() {
	return wickets;
}
public void setWickets(int wickets) {
	this.wickets = wickets;
}
}
