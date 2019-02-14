package com.qa;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository ;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Person p = new Person ( ) ;
//		p.setName("Fred");
//
//		personRepository.save(p) ;

		List<Person> people = personRepository.findAll();

		people.forEach(System.out::println);

		people.forEach(p -> p.setName( p.getName().toUpperCase()));

		personRepository.saveAll(people) ;

	}
}
