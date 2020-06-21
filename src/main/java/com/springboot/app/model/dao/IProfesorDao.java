package com.springboot.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.entities.Profesor;

public interface IProfesorDao extends JpaRepository<Profesor, Integer>{

	public boolean existsByDocumento(String documento);
	public boolean existsByCorreo(String correo);
	public boolean existsByCodigo(String codigo);
	public Optional<Profesor> findByCodigo(String codigo);
	
}