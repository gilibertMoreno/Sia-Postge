package com.springboot.app.service;

import java.util.ArrayList;
import com.springboot.app.model.entities.Coordinador;

public interface ILoginService {
	
	public String loginCoordinador(String codigo, String Password);
	public String loginEstudiante(String codigo, String Password);
	public String loginProfesor(String codigo, String Password);
	
	//public String registrarService(int id,String correo,String password,String documento,String codigo,String nombre);
	//public ArrayList<Coordinador> listarCoordinadores();

}
