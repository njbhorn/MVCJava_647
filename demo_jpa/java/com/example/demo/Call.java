package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Call {
	
	@Id
	@GeneratedValue
	private int id ;
	
	@ManyToOne
	@JoinColumn (name="phone_id")
	private Phone phone ;
	
	private long duration ;
	
	public Call() {
		
	}

	public Call(Phone phone) {
		super();
		this.phone = phone;
	}

	public Call(Phone phone, long duration) {
		super();
		this.phone = phone;
		this.duration = duration;
	}
	
	// get and set
	
	
	
	
}
