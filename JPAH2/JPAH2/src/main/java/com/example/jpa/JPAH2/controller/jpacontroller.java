package com.example.jpa.JPAH2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jpacontroller {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
}
