package com.inti.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main")
public class MainController {
	
	@GetMapping("test")
	public String hello(@RequestParam(value="nom", required = false, defaultValue = "samsung") String nom, Model n) 
	{
		System.out.print("nom : " + nom);
		n.addAttribute("name", nom);
		
		List<String> nomList = List.of("antoine", "ambre", "roxanne");
		
		n.addAttribute("nomList", nomList);
		return "hello";
	}

}
