package com.example.mavenprojectspringboot.models;

public class movie {
	
	private String name;
	private String details;
	
	
	public movie(String name, String details) {
		super();
		this.name = name;
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
