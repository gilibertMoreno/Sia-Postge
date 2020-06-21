package com.springboot.app.service;

import java.util.ArrayList;

import com.springboot.app.model.entities.Profesor;

public interface IProfesorService {

	public String registrarService(int id,String documento,String nombre,String direccion,String datosprofesionales,String password,String codigo,String correo);
	public ArrayList<Profesor> listarProfesores(String posgrado);
}
