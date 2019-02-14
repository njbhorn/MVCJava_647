package com.qa.thyeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.qa.controller","com.qa.dao"})
public class ThymeleafSkeletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafSkeletonApplication.class, args);
	}
}
