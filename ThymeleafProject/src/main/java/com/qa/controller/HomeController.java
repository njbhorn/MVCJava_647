package com.qa.controller;

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
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	VetDAO dao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("Owners", dao.getAllOwners());
		model.addAttribute("newowner", new Owner());
		model.addAttribute("newanimal", new Animal());
		return "home";
	}
	
	@RequestMapping(value="/processForm")
	public String processForm(@ModelAttribute Owner newOwner, Model model){
		System.out.println(newOwner);
		dao.saveOwner(newOwner);
		return home(model);
	}
	
	
	@RequestMapping(value="/addAnimal", method = RequestMethod.POST)
	public String animal(@ModelAttribute Animal newAnimal, Model model, @RequestParam(value="ownerID") int ownerID){
		dao.saveAnimal(newAnimal);
		dao.addAnimalToOwner(ownerID, newAnimal);
		return home(model);
	}
	
}
