package com.springboot.app.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.dao.IEstudianteDao;
import com.springboot.app.model.entities.Estudiante;
import com.springboot.app.service.IEstudianteService;
@Service
public class EstudianteServiceImp implements IEstudianteService{
	
	@Autowired
	private IEstudianteDao estudiantedao;
	

	@Override
	public String registrarService(int id, String codigo, String nombre, String documento, String correo,
			String telefono, String password) {
		// TODO Auto-generated method stub
		
		if(estudiantedao.existsByCodigo(codigo)) {
			return"El codigo esta asociado a un usuario";			
		}else if(estudiantedao.existsByDocumento(documento)) {
			return "El usuario se encuentra registrado";
		}else if (estudiantedao.existsByCorreo(correo)) {
			return"este correo ya esta asociado a un estudiante";
		}else {
			Estudiante estudiante=new Estudiante();
			estudiante.setCodigo(codigo);
			estudiante.setCorreo(correo);
			estudiante.setDocumento(documento);
			estudiante.setTelefono(telefono);
			estudiante.setNombre(nombre);
			estudiante.setPassword(password);
			estudiante.setId(id);
			estudiantedao.save(estudiante);
			return "Registro exitoso";
		}
		
		
	}

	@Override
	public ArrayList<Estudiante> listarEstudianteSemestre(int semestre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Estudiante> listarEstudianteMateria(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
