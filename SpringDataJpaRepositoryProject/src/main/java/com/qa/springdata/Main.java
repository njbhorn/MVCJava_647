package com.qa.springdata;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.qa.beans.Animal;
import com.qa.beans.Owner;
import com.qa.configs.SpringConfig;
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
		
		// get the spring context from annotations 
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
						SpringConfig.class);

				// get the beans from the context
				Owner alice = (Owner) context.getBean("alice");
				Owner bob = (Owner) context.getBean("bob");
				
				System.out.println("I am here "+alice);
				
				HashMap<String, Animal> list = new HashMap<String, Animal>(
						context.getBeansOfType(Animal.class));

				// save all the objects to the database using JPAService
				
				
				jpaService.saveOwners(alice,bob);
				
				
				for (Animal a : alice.getAnimals()){
					//used for the object rather than the int link in the animal
//					a.setOwner(alice);
					//set the owner ID for each animal as we save it. 
					a.setOwnerID(alice.getOwnerID());
					jpaService.saveAnimal(a);
				}
				for (Animal a : bob.getAnimals()){
					//used for the object rather than the int link in the animal
//					a.setOwner(bob);
					a.setOwnerID(bob.getOwnerID());
					jpaService.saveAnimal(a);
				}

				//find all owners
				List<Owner> ownerList = jpaService.getAllOwners();
				
				// print them to System.out
				for (Owner o : ownerList) {
					System.out.println(o);
				}
		
		
	}
}
