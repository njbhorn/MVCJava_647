package com.qa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	
}
