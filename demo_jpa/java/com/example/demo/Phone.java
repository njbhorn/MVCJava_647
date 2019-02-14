package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private int phone_id;
	
	private int number ;
	
	@OneToOne(mappedBy="phone")
	private Person person;
	
	public Phone() {
		
	}

	public Phone(int number) {
		this.number = number ;
	}
	
	public Phone(int number, Person person) {
		super();
		this.number = number;
		this.person = person;
	}
	
	// get and set
	
	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Phone [id=" + phone_id + ", number=" + number + "]";
	}
	
	

}
