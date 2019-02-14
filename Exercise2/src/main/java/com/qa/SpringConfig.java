package com.qa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.beans.Owner;
import com.qa.beans.Pet;

@Configuration
public class SpringConfig {
	
	@Bean
	public Pet pet1Bean () {
		Pet pet = new Pet ();
		pet.setName("Daisy");
		return pet ;
	}
	
	@Bean
	public Pet pet2Bean() {
		return new Pet ("Lola");
	}
	
	@Bean
	public Pet pet3Bean() {
		return new Pet ("Annie");
	}
	
	@Bean
	public Owner owner1Bean() {
		Owner owner = new Owner() ;
		owner.setName("Pet Lover");
		Pet[] pets = {pet1Bean(), pet2Bean(), pet3Bean()} ;
		owner.setPets( pets );
		return owner ;
	}
	
}
