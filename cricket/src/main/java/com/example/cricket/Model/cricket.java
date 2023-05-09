package com.example.cricket.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class cricket {
	
	@Id
	private int Sno;
	private String Name;
	private int Jerseyno;
	private int Age;
	private String Country;
	private String Role;
	private int Matches;
	private int Runs;
	private int Wickets;
	private String Team;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getJerseyno() {
		return Jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		Jerseyno = jerseyno;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public int getMatches() {
		return Matches;
	}
	public void setMatches(int matches) {
		Matches = matches;
	}
	public int getRuns() {
		return Runs;
	}
	public void setRuns(int runs) {
		Runs = runs;
	}
	public int getWickets() {
		return Wickets;
	}
	public void setWickets(int wickets) {
		Wickets = wickets;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
}
