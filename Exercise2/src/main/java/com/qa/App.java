package com.qa;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.beans.Owner;
import com.qa.beans.Pet;

public class App {
	
	public App() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Pet pet1 = ( Pet ) context.getBean("pet1Bean");
		Pet pet2 = ( Pet ) context.getBean("pet2Bean");
		Pet pet3 = ( Pet ) context.getBean("pet2Bean");
		Owner owner = ( Owner ) context.getBean("owner1Bean");
		
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet2);
		System.out.println(owner);
		
		System.out.println("*** Using a Map ***");
		
		HashMap<String, Pet> list = new HashMap <String, Pet> ( context.getBeansOfType(Pet.class));
		for ( String key : list.keySet()) {
			System.out.println(list.get(key).getName());
		}
	}
	
	public static void main ( String[] args) {
		new App();
	}

}
