package com.qa.springdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.qa.services.JPAService;

@SpringBootApplication
@ComponentScan(basePackages={"com.qa.services"})
@EnableJpaRepositories(basePackages={"com.qa.repositories"})
@org.springframework.boot.autoconfigure.domain.EntityScan(basePackages={"com.qa.beans"})
public class Main implements CommandLineRunner{

	@Autowired
	private JPAService jpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		// 6) 
		// Add your code here
		
	}
}
