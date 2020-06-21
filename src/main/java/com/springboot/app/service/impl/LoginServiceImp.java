package com.springboot.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.dao.ICoordinadorDao;
import com.springboot.app.model.dao.IEstudianteDao;
import com.springboot.app.model.dao.IProfesorDao;
import com.springboot.app.model.entities.Coordinador;
import com.springboot.app.model.entities.Estudiante;
import com.springboot.app.model.entities.Profesor;
import com.springboot.app.service.ILoginService;

@Service
public class LoginServiceImp implements ILoginService {

	@Autowired
	private ICoordinadorDao coordinadorDao;

	@Autowired
	private IEstudianteDao estudianteDao;

	@Autowired
	private IProfesorDao profesorDao;

	@Override
	public String loginCoordinador(String codigo, String password) {
		// TODO Auto-generated method stub
		Optional<Coordinador> opt = coordinadorDao.findByCodigo(codigo);
		if (opt.isPresent()) {
			Coordinador coordinador = opt.get();
			if (coordinador.getPassword().equals(password)) {
				return "Bienvenido";
			} else {
				return "Password incorrecto";
			}
		} else {
			return "El usuario no existe";
		}
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

	/*
	 * @Override public ArrayList<Coordinador> listarCoordinadores() { // TODO
	 * Auto-generated method stub return null; }
	 */

	@Override
	public String loginEstudiante(String codigo, String password) {
		Optional<Estudiante> opt=estudianteDao.findByCodigo(codigo);
		if(opt.isPresent()) {
			Estudiante estudiante=opt.get();
			if(estudiante.getPassword().equals(password)) {
				return "Bienvenido";
			}else {
				return "Password incorrecto";
			}
		}else {
			return "El usuario no existe";
		}
	}

	@Override
	public String loginProfesor(String codigo, String password) {
		Optional<Profesor> opt=profesorDao.findByCodigo(codigo);
		if(opt.isPresent()) {
			Profesor profesor=opt.get();
			if(profesor.getPassword().equals(password)) {
				return "Bienvenido";
			}else {
				return "Password incorrecto";
			}
		}else {
			return "El usuario no existe";
		}
	}

}
