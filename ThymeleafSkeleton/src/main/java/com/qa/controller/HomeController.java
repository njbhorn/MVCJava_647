package com.qa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qa.beans.Animal;
import com.qa.beans.Owner;
import com.qa.dao.VetDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Model model) {
		
		return "home";
	}
	
	@RequestMapping(value="/processForm")
	public String processForm(){
		
		return null; // to be replaced
	}
	
	
	@RequestMapping(value="/addAnimal", method = RequestMethod.POST)
	public String animal(){
		return null; // to be replaced
	}
	
}
