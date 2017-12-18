package com.example.main;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return this.firstName+" "+this.lastName;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void init() {
		System.out.println("init called \n");
	}

	public void destroy() {
		System.out.println("destroy called\n");
	}
}
