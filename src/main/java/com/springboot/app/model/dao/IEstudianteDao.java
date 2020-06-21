package com.springboot.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.entities.Estudiante;

public interface IEstudianteDao extends JpaRepository<Estudiante, Integer> {
	public boolean existsByCodigo(String codigo);
	public boolean existsByCorreo(String correo);
	public boolean existsByDocumento(String documento);
	public Optional<Estudiante> findByCodigo(String codigo);
}
