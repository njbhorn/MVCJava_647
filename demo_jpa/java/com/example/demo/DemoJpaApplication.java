package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {
	
	@Autowired
	PhoneRepository phoneRepository ;
	@Autowired
	PersonRepository personRepository;
	@Autowired
	CallRepository callRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Phone phoneF = new Phone (12345678) ;
		Phone phoneM = new Phone ( 12345679) ;
		Person fred = new Person ( "fred", phoneF ) ;
		Person mary = new Person ( "mary", phoneM ) ;
 		Call call1 = new Call (phoneF) ;
 		Call call2 = new Call (phoneF, 30) ;
 		Call call3 = new Call (phoneF, 120 ) ;
 		Call call4 = new Call (phoneM);
 		
 		phoneRepository.save(phoneF);
 		phoneRepository.save(phoneM);
 		personRepository.save( fred );
 		personRepository.save( mary );
 		
 		callRepository.save(call1);
 		callRepository.save(call2);
 		callRepository.save(call3);
 		callRepository.save(call4);
 }

}
