package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.entities.Materia;

public interface IGestionMateriasService {

	public String registarMateria(int id,String codigo,String nombre,String descrpcion,String semestre,int creditos,int idPensum);
	public String actualizarMateria(int id,String codigo,String nombre,String descrpcion,String semestre,int creditos,int idPensum);
	public String eliminarMateria(String codigo);
	public List<Materia> listarMaterias(String codigoPensum);
	
}
