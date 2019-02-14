package com.qa.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.qa.beans.Animal;
import com.qa.beans.Owner;
@Component
public class VetDAOImpl implements VetDAO{
	
	ArrayList<Animal> animals;
	ArrayList<Owner> owners; 
	
	
	public VetDAOImpl(){
		animals = new ArrayList<Animal>();
		owners = new ArrayList<Owner>();
		
		Owner alice = new Owner(0, "Alice", "Alice@email.com");
		Owner bob = new Owner(1, "Bob", "bob@email.com");
		
		Animal alpha = new Animal(0, "Alpha", "Dog", getDate("10-01-2014"));
		Animal beta = new Animal(1, "Beta", "Dog", getDate("15-01-2014"));
		Animal gamma = new Animal(2, "Gamma", "Cat", getDate("08-03-2008"));
		Animal delta = new Animal(3, "Delta", "Cat", getDate("09-01-2009"));
		Animal epsilon = new Animal(4, "Epsilon", "Rabbit", getDate("20-03-2013"));
		
		alice.addAnimal(alpha);
		alice.addAnimal(beta);
		bob.addAnimal(gamma);
		bob.addAnimal(delta);
		bob.addAnimal(epsilon);
		
		animals.add(alpha);
		animals.add(beta);
		animals.add(gamma);
		animals.add(delta);
		animals.add(epsilon);
		
		owners.add(alice);
		owners.add(bob);
		 
	}
	
	private Date getDate(String dateStr){
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
		} catch (ParseException e) {
			return new Date();
		}
	}

	public ArrayList<Animal> getAllAnimals(){
		  return animals;
	}
	
	public ArrayList<Owner> getAllOwners(){
		return owners;
	}
	
	public Owner getOwnerByID(int i){
		for (Owner o : owners){
			if (o.getOwnerID() == i){
				return o;
			}
		}
		return null;
	}
	
	public Animal getAnimalByID(int i){
		for (Animal a : animals){
			if (a.getAnimalID() == i){
				return a;
			}
		}
		return null;
	}
	
	public void saveOwner(Owner newOwner){
		newOwner.setOwnerID(owners.size());
		owners.add(newOwner);
	}
	
	public void saveAnimal(Animal animal){
		animal.setAnimalID(animals.size());
		animals.add(animal);
	}
	
	public void addAnimalToOwner(int id, Animal animal){
		for(Owner o : owners){
			if (o.getOwnerID() == id){
				o.addAnimal(animal);
				break;
			}
		}
	}
}
