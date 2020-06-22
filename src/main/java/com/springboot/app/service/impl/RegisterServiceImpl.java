package com.springboot.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.dao.IAspiranteDao;
import com.springboot.app.model.dao.ICoordinadorDao;
import com.springboot.app.model.dao.IEstudianteDao;
import com.springboot.app.model.dao.IProfesorDao;
import com.springboot.app.model.entities.Aspirante;
import com.springboot.app.model.entities.Coordinador;
import com.springboot.app.model.entities.Estudiante;
import com.springboot.app.model.entities.Profesor;
import com.springboot.app.service.IRegisterService;

@Service
public class RegisterServiceImpl implements IRegisterService {
	
	@Autowired
	public ICoordinadorDao coordinadordao;
	
	@Autowired
	public IProfesorDao profesordao;
	
	@Autowired
	public IEstudianteDao estudiantedao;
	
	
	public IAspiranteDao aspirantedao;

	@Override
	public String registrarCoordinador(int id, String correo, String password, String documento, String codigo,
			String nombre) {
		// TODO Auto-generated method stub
		if (coordinadordao.existsByCorreo(correo)) {
			return "Este correo esta asociado a otro usuario";
		} else if (coordinadordao.existsByDocumento(documento)) {
			return "El usuario se encuentra registrado";
		} else if (coordinadordao.existsByCodigo(codigo)) {
			return "El codigo se encuentra asociado a otro usuario";
		} else {
			Coordinador coordinador = new Coordinador();
			coordinador.setCodigo(codigo);
			coordinador.setCorreo(correo);
			coordinador.setDocumento(documento);
			coordinador.setPassword(password);
			coordinador.setIddirector(id);
			coordinadordao.save(coordinador);
			return "Registro exitoso!";
		}
	}

	@Override
	public String registrarEstudiante(int id, String codigo, String nombre, String documento, String correo,
			String telefono, String password) {
		// TODO Auto-generated method stub
		if(estudiantedao.existsByDocumento(documento)) {
			return "El estudiante ya se encuentra registrado";
		}else if (estudiantedao.existsByCodigo(codigo)) {
			return "El codigo ya esta asociado a un estudiante";
		}else if(estudiantedao.existsByCorreo(correo)){
			return"Este correo ya seencuentra asociado a otro estudiante";		
		}else {
			Estudiante estudiante=new Estudiante();
			estudiante.setId(id);
			estudiante.setCodigo(codigo);
			estudiante.setNombre(nombre);
			estudiante.setDocumento(documento);
			estudiante.setCorreo(correo);
			estudiante.setTelefono(telefono);
			estudiante.setPassword(password);
			return"Registro exitoso";
		}
		
	}

	@Override
	public String registrarrpfesor(int id, String documento, String nombre, String direccion, String datosprofesionales,
			String password, String codigo, String correo) {
		if(profesordao.existsByDocumento(documento)) {
			return "El usuario ya se encuentra registrado";
		}else if(profesordao.existsByCorreo(correo)) {
			return "El correo se encuentra asociado a un usuario";
		}else if(profesordao.existsByCodigo(codigo)) {
			return "El codigo se encuentra asociado a otro profesor";
		}else {
			Profesor profesor=new Profesor();
			profesor.setId(id);
			profesor.setCodigo(codigo);
			profesor.setNombre(nombre);
			profesor.setCorreo(correo);
			profesor.setDocumento(documento);
			profesor.setDatosprofesionales(datosprofesionales);
			return"Registro exitoso";
		}
		
	}

	@Override
	public String registrarAspirante(int id, String nombre, String documento, String fecha, String correo,
			String telefono, String password) {
		// TODO Auto-generated method stub
		if(aspirantedao.existsByDocumento(documento)) {
			return "Usuario registrado";
		}else {
			Aspirante aspirante=new Aspirante();
			aspirante.setId(id);
			aspirante.setNombre(nombre);
			aspirante.setFecha(fecha);
			aspirante.setCorreo(correo);
			aspirante.setTelefono(telefono);
			aspirante.setPassword(password);
			
		}
		
		return null;
	}
	
	/*
	 * @Override public String registrarService(int id, String correo, String
	 * password, String documento, String codigo, String nombre) { // TODO
	 * Auto-generated method stub if(coordinadordao.existsByCorreo(correo)) {
	 * return"Este correo esta asociado a otro usuario"; }else
	 * if(coordinadordao.existsByDocumento(documento)) {
	 * return"El usuario se encuentra registrado"; }else
	 * if(coordinadordao.existsByCodigo(codigo)) {
	 * return"El codigo se encuentra asociado a otro usuario"; }else { Coordinador
	 * coordinador=new Coordinador(); coordinador.setCodigo(codigo);
	 * coordinador.setCorreo(correo); coordinador.setDocumento(documento);
	 * coordinador.setPassword(password); coordinador.setIddirector(id);
	 * coordinadordao.save(coordinador); return"Registro exitoso!"; }
	 * 
	 * 
	 * }
	 */

	

}
