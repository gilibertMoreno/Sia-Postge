package com.springboot.app.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.app.model.dao.IProfesorDao;
import com.springboot.app.model.entities.Profesor;
import com.springboot.app.service.IProfesorService;

@Service
public class ProfesorServiceImp implements IProfesorService{

	private IProfesorDao profesordao;
	

	@Override
	public String registrarService(int id, String documento, String nombre, String direccion, String datosprofesionales,
			String password, String codigo, String correo) {
		// TODO Auto-generated method stub
		if(profesordao.existsByDocumento(documento)) {
			return"El usuario ya esta registrado";
		}else if(profesordao.existsByCodigo(codigo)) {
			return "El codigo ya esta registrado";
		}else if(profesordao.existsByCorreo(correo)) {
			return "El correo se encuentra asociado a un usuario";
		}else {
			Profesor profesor=new Profesor();
			profesor.setId(id);
			profesor.setCodigo(codigo);
			profesor.setDocumento(documento);
			profesor.setNombre(nombre);
			profesor.setDatosprofesionales(datosprofesionales);
			profesor.setDireccion(direccion);
			profesor.setPassword(password);
			profesor.setCorreo(correo);
			profesordao.save(profesor);
		}
		
		return null;
	}

	@Override
	public ArrayList<Profesor> listarProfesores(String posgrado) {
		// TODO Auto-generated method stub
		return null;
	}

}
