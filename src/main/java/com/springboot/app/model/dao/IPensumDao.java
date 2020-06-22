package com.springboot.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.entities.Pensum;

public interface IPensumDao extends JpaRepository<Pensum, Integer>{
	
	public Optional<Pensum> findByCodigo(String codigo);
	

}
