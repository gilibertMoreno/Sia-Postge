package com.springboot.app.service;

import java.util.ArrayList;

import com.springboot.app.model.entities.Aspirante;

public interface IAspiranteService {
	public String loginService(String correo, String Password);
	public String registrarService(int id,String nombre,String documento,String fecha,String correo,String telefono,String password, String anexos);
	public ArrayList<Aspirante> listarAspirantes(String codigopost);
}
