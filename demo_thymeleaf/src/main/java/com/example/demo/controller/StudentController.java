package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Student;
import com.example.demo.model.StudentRepository;


@Controller	
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository ;
	
	@RequestMapping("/")
	public String listStudents(Model model) {
		
		List<Student> students = studentRepository.findAll() ;
		
		model.addAttribute("students", students);
		
		return "list" ;
	}
	
	 @RequestMapping("/show/{id}")
	    public String getProduct(@PathVariable String id, Model model){
		 
		 Optional<Student> opt = studentRepository.findById(Long.valueOf(id));
		 
		 Student stud = opt.get() ;
				 
		 model.addAttribute("student", stud);
	     
		 return "show";
	    }
	 
	 @RequestMapping ("/update/{id}")
	 public String updateStudentGet(@PathVariable String id, Model model) {
		 
		 Optional<Student> opt = studentRepository.findById(Long.valueOf(id));
		 
		 Student stud = opt.get() ;
		 
		 model.addAttribute("student", stud);
		 
		 return "update";
//		 return "redirect:/show/{id}" ;
	 }
	 
	 @RequestMapping (value="/update", method = RequestMethod.POST)
	 public String updateStudentPost(Student student, Model model) {
		 
		 studentRepository.save(student);
		 				 
		 return "redirect:/show/" + student.getId() ;
		
	 }
	 
	 @RequestMapping ("/delete/{id}")
	 public String deleteStudent(@PathVariable String id, Model model) {
		 
		 studentRepository.deleteById(Long.valueOf(id));
		 
		 return "redirect:/" ;
	 }
	 
	 @RequestMapping ("/new")
	 public String newStudentForm ( Student student, Model model ) {
		 student.setId(10099L);
		 return "new" ;
	 }
	 
	 @RequestMapping (value="/new", method=RequestMethod.POST )
	 public String newStudent ( Student student, Model model ) {
		 studentRepository.save(student);
		 return "redirect:/" ;
	 }
}
