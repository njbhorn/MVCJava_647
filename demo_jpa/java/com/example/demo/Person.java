package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Person {

		@Id
		@GeneratedValue
		private int id;
		
		private String name;
		
		@OneToOne
		@JoinColumn(name="phone_id")
		private Phone phone;
		
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Person(String name, Phone phone) {
			super();
			this.name = name;
			this.phone = phone ;
		}
		
		// get and set

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Phone getPhone() {
			return phone;
		}

		public void setPhone(Phone phone) {
			this.phone = phone;
		}
		
		
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
		}

		

		
		
		
		
		
}
