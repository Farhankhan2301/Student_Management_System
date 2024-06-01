package com.example.student_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NavigationController {
	
	@GetMapping("/")
	public String index(Model model) {
		System.out.println("Index route");
		model.addAttribute("currentPage", "index");
		return "index";
	}
	
	@GetMapping("/registerPage")
	public String regester(Model model) {
		System.out.println("reached here");
		model.addAttribute("currentPage", "addStudent");
		return "addStudent";
	}
	@GetMapping("/searchPage")
	public String search(Model model) {
		model.addAttribute("currentPage", "searchStudent");
		return "searchStudent";
	}	
	@GetMapping("/updatePage")
	public String update(Model model) {
		model.addAttribute("currentPage", "updateStudent");
		return "updateStudent";
	}
	@GetMapping("/deletePage")
	public String delete(Model model) {
		model.addAttribute("currentPage", "deleteStudent");
		return "deleteStudent";
	}	
}