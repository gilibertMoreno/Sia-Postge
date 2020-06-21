package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.springboot.app.service.ILoginService;


@Controller
public class LoginController {
	
    @Autowired
	private  ILoginService loginService;
	
    @PostMapping("/login_coordinador")
	public String loginCoordinador(@RequestParam String codigo, @RequestParam String password,Model model) {
    	String mesage=loginService.loginCoordinador(codigo, password);
		if(mesage.equalsIgnoreCase("Bienvenido")) {
			model.addAttribute("success", mesage);
			return("coordinador/index");
		}else {
			model.addAttribute("error", mesage);
			return("redirect:login_coordinador");
		}
	}
	
    @PostMapping("/login_estudiante")
	public String loginEstudiante(@RequestParam String codigo, @RequestParam String password,Model model) {
    	String mesage=loginService.loginEstudiante(codigo, password);
		if(mesage.equalsIgnoreCase("Bienvenido")) {
			model.addAttribute("success", mesage);
			return("estudiante/index");
		}else {
			model.addAttribute("error", mesage);
			return("redirect:login_estudiante");
		}
	}
	
    @PostMapping("/login_profesor")
	public String loginProfesor(@RequestParam String codigo, @RequestParam String password,Model model) {
    	String mesage=loginService.loginProfesor(codigo, password);
		if(mesage.equalsIgnoreCase("Bienvenido")) {
			model.addAttribute("success", mesage);
			return("profesor/index");
		}else {
			model.addAttribute("error", mesage);
			return("redirect:login_profesor");
		}
	}
	
	
	/*
	 * @PostMapping ("/ingreso") public String register(@RequestParam String
	 * correo, @RequestParam String password,Model model) { String
	 * mesage=loginService.loginCoordinador(correo, password);
	 * if(mesage.equalsIgnoreCase("Bienvenido")) { model.addAttribute("success",
	 * mesage); return("coordinador/index"); }else { model.addAttribute("error",
	 * mesage); return("register"); }
	 * 
	 * }
	 */

}
