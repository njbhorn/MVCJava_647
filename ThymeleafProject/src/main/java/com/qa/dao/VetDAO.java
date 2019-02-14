package com.qa.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.qa.beans.Animal;
import com.qa.beans.Owner;
@Component
public interface VetDAO {

	public ArrayList<Animal> getAllAnimals();
	
	public ArrayList<Owner> getAllOwners();
	
	public Owner getOwnerByID(int i);
	
	public Animal getAnimalByID(int i);
	
	public void saveOwner(Owner newOwner);
	
	public void saveAnimal(Animal animal);
	
	public void addAnimalToOwner(int id, Animal animal);
}
