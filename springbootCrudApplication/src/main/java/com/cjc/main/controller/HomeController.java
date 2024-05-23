package com.cjc.main.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeService;

@Controller
public class HomeController { 

	@Autowired
	HomeService hs;
	
	
	@GetMapping("/") 
	public String prelogin() { 
		return "login";
	}
	
	 
	@RequestMapping("/reg")
	public String preregister() { 
		
		return"register";
	}  
	
	
	@RequestMapping("/register") 
	public String register(@ModelAttribute Student s) {
		
		hs.saveData(s);
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam ("uname") String un,@RequestParam ("password") String ps,Model m) {
		
		
		if(un.equals("admin") && ps.equals("admin")) {

			Iterable<Student> ls=hs.discplayAllData();// iterable is uded for iterate the all list,map,set
	         m.addAttribute("data",ls); 
			return "success"; 
		}
		else {
        	Student ls=hs.findByUnameAndPassword(un, ps);// student is used for single student data
        	
	         m.addAttribute("stud",ls);
	         System.out.println(ls.getMobileno());
			return "success2";
		}
		
	}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Student s,Model m) {
		
		hs.deleteData(s); 
		Iterable<Student> ls=hs.discplayAllData();
        m.addAttribute("data",ls);
		return "success";
	}
	
	
	@RequestMapping("/edit")
	public String editData(@RequestParam ("uid") int uid,Model m) {
		
	Student s =hs.editData(uid);
	m.addAttribute("data",s);
	return "edit";
	}
	 
    
	@RequestMapping("/updatestu")
	public String updateData(@ModelAttribute Student s,Model m) {
		
		hs.saveData(s);
		Iterable<Student>ls=hs.discplayAllData();
		m.addAttribute("data",ls);
		
		return "success";
	}
	
	
	
	
} 
