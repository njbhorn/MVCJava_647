package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@Autowired
	MyInfo myInfo ;

	@ModelAttribute("myInfo")
	public MyInfo info() {
		return myInfo ;
	}

	@RequestMapping("/")
	public String demoWeb (Model m, @ModelAttribute MyInfo newInfo) {
		System.out.println("Gloabl" + myInfo);
		System.out.println("Model att " + newInfo);
//		MyInfo myInfo = new MyInfo() ;
//		myInfo.setInfo("Info from controller");
//		myInfo.setMoreInfo("More info...");
//		m.addAttribute("infoObj", myInfo);
//		m.addAttribute(myInfo);
		m.addAttribute("info", "This is info");
		return "DemoForm" ;
	}

	@RequestMapping("/demo")
	public String demoWebNext (Model m) {
//		myInfo.setInfo("Demo Changed Info");
//		m.addAttribute("info2", "This is page 2");
		return "demo2" ;
	}

	@RequestMapping("/processForm")
	public String demoProcessForm (@ModelAttribute MyInfo modAtt ) {
		System.out.println("Global = " + myInfo);
		System.out.println("Model Att = " + modAtt);
//		myInfo.setInfo("Demo Changed Info");
//		m.addAttribute("info2", "This is page 2");
		return "demo2" ;
	}

	@RequestMapping("/list")
	public String demoList ( Model m ) {
		List<Person> people = new ArrayList<>() ;
		people.add(new Person ( 100, "Fred"));
		people.add(new Person ( 200, "Bill"));
		people.add(new Person ( 300, "Mary"));
		m.addAttribute("people",people) ;
		return "list";
	}
}
