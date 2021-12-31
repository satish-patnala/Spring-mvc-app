package com.app.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("/test")
	public String testMethod(){
		return "Hello-world";
	}
}
