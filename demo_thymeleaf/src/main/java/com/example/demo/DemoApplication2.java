package com.example.demo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	
//	@Autowired
//	StudentRepository repository ;

	public static void main(String[] args) {
//		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		// show autoconfigured beans
		
//		String[] beanNames = ctx.getBeanDefinitionNames() ;
//		Arrays.sort(beanNames);
//		System.out.println("SpringBoot bean names autoconfigured...");
//		for ( String beanName : beanNames ) {
//			System.out.println(beanName);
//		}
		
		SpringApplication.run(DemoApplication.class, args) ;
		
	}

	@Override
	public void run(String... args) throws Exception {
		
//		logger.info("Student id 10001 -> {}", repository.findById(10001L));
//		
//		logger.info("All students 1. -> {}", repository.findAll());
//		
//		logger.info("Inserting -> {}", repository.save(new Student("John", "A1234569")));
//		
//		logger.info("Update 10001 -> {}", repository.save(new Student(10001L, "Jimxxx", "New Passport")));
//		
//		logger.info("All students 2. -> {}", repository.findAll());
		
	}
}
