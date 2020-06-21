package com.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"/",""})
	public String index() {
		return "loginestud";
	}
	
	@GetMapping("/login_coordinador")
	public String loginCoordinador() {
		return"logincord";
	}
	
	@GetMapping("/login_estudiante")
	public String loginEstudiante() {
		return"loginestud";
	}
	
	@GetMapping("/login_profesor")
	public String loginProfesor() {
		return"loginprof";
	}
	

}
