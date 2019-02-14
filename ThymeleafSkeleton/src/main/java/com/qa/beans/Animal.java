package com.qa.beans;


import java.util.Date;


public class Animal {

	private int animalID;
	private String name;
	private String type;
	private Date dob;
	private int ownerID;

	
	
	public Animal() {
	}

	public Animal(int animalID, String name,
			String type, Date dob) {
		this.animalID = animalID;
		this.name = name;
		this.type = type;
		this.dob = dob;
	}

	public int getAnimalID() {
		return animalID;
	}

	public void setAnimalID(int animalID) {
		this.animalID = animalID;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String toString(){
		return animalID + ": " + name + ", " + type + ", " + dob;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
}
