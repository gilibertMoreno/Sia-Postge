package com.springboot.app.service;

import java.util.ArrayList;

import com.springboot.app.model.entities.Estudiante;

public interface IEstudianteService {

	public String registrarService(int id,String codigo,String nombre,String documento,String correo,String telefono,String password);
	public ArrayList<Estudiante> listarEstudianteSemestre(int semestre);
	public ArrayList<Estudiante> listarEstudianteMateria(String codigo);

	
}
