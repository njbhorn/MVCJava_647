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
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args) ;
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
