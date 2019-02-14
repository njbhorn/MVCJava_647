package com.qa.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.qa.beans.Customer;
import com.qa.repositories.CustomerRepository;

@SpringBootApplication
@ComponentScan(basePackages={"com.qa.repositories","com.qa.beans"})
public class Main implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		
		// Invoke findAllCustomers() method
		
		List<Customer> customerList = customerRepository.findAllCustomers();
		
		
		System.out.println(customerList);
		
		// Invoke addCustomer() method
		int i = customerRepository.addCustomer(1000, "Michael", "East Street");
	
	
	    System.out.println(i+"record inserted successfully");
	    
	    System.out.println("After insert : records are ");
	    
	    System.out.println(customerRepository.findAllCustomers());
	    
	 // Invoke updateCustomerAddressById() method
	    
	    i = customerRepository.updateCustomerAddressById("Greater London", 101);
	    
	    System.out.println(i+" record updated");
	    
        System.out.println("After Update : records are ");
	    
	    System.out.println(customerRepository.findAllCustomers());
	    
	    // Invoke deleteCustomerById() method
	    i = customerRepository.deleteCustomerById(102);
	    
	    System.out.println(i+" record deleted");
	    
        System.out.println("After Delete : records are ");
	    
	    System.out.println(customerRepository.findAllCustomers());
	    
	    // Invoke findCustomerById() method
	  
	    System.out.println("Customer by ID ");
	    System.out.println(customerRepository.findCustomerById(101));
	    

	}
	
	

}
