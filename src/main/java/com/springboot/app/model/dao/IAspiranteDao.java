package com.springboot.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.entities.Aspirante;

public interface IAspiranteDao extends JpaRepository<Aspirante, Integer> {
	
	public boolean existsByDocumento(String documento);
	public Optional<Aspirante> findByDocumento(String documento);

}
