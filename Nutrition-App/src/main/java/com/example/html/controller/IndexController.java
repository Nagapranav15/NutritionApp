package com.example.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.html.mode.User;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user, Model model)
	{
		System.out.println(user.toString());
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getDob());
		System.out.println(user.getEmail());
		model.addAttribute("firstname",user.getFname());
		model.addAttribute("lastname",user.getLname());
		
		return "welcome";
	}

}
