package com.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/coordinador")
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "coordinador/index";
	}
	
	@GetMapping("/logcor")
	public String loginCoordinador() {
		return"logincord";
	}
	

}
