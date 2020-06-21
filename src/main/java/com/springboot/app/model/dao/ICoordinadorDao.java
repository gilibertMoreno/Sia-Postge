package com.springboot.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.entities.Coordinador;

public interface ICoordinadorDao extends JpaRepository<Coordinador, Integer>{

	public boolean existsByDocumento(String documento);
	public boolean existsByCorreo(String correo);
	public boolean existsByCodigo(String codigo);
	public Optional<Coordinador> findByCodigo(String codigo);
	public Optional<Coordinador> findByCorreo(String correo);
	
}
