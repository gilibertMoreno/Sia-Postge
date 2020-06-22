package com.springboot.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.entities.Materia;
import com.springboot.app.model.entities.Pensum;

public interface IMateriaDao extends JpaRepository<Materia, Integer> {
	public boolean existsByCodigoAndPensum(String codigo,Pensum pensum);
	public boolean existsByNombre(String nombre);
	public boolean existsByIdpensum(Integer pensum);
	public Optional<Materia> findByCodigo(String codigo);
	
}
