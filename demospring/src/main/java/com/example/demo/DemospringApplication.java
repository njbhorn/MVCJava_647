package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository ;

	public static void main(String[] args) {
		SpringApplication.run(DemospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Here we are....");

		List<Person> people = personRepository.findAll() ;

		System.out.println(people);

		people.stream()
//		.map( p -> p.getName())
		.filter( p -> p.getName().startsWith("S"))
//		.forEach(p -> System.out.println(p)) ;
		.forEach(System.out::println);


//		for ( Person p : people ) {
//			System.out.println("Id = " + p.getId() + " Name = " + p.getName() );
//		}

//		Person newp = new Person () ;
//		newp.setName("Sally");
//		personRepository.save(newp);
//		Optional<Person> o = personRepository.findById(4) ;
//		Person p = o.get() ;
//
////		p.setId(99);
//		p.setName("Peter");
//
//		personRepository.save(p) ;

	}
}
