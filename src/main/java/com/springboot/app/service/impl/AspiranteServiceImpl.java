package com.springboot.app.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.app.model.dao.IAspiranteDao;
import com.springboot.app.model.entities.Aspirante;
import com.springboot.app.service.IAspiranteService;

@Service
public class AspiranteServiceImpl implements IAspiranteService{
	private IAspiranteDao aspirantedao;
	@Override
	public String loginService(String documento, String password) {
		// TODO Auto-generated method stub
		Optional<Aspirante> opt=aspirantedao.findByDocumento(documento);
		if(opt.isPresent()) {
			Aspirante aspirante=opt.get();
			if(aspirante.getPassword().equals(password)) {
				return "Bienvenido";
			}else {
				return "Password incorrecto";
			}
		}else {
			return "El usuario no existe";
		}
	}

	@Override
	public String registrarService(int id, String nombre, String documento, String fecha, String correo,
			String telefono, String password, String anexos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Aspirante> listarAspirantes(String codigopost) {
		// TODO Auto-generated method stub
		return null;
	}

}
