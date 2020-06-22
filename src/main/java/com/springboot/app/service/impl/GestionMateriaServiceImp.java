package com.springboot.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.dao.IMateriaDao;
import com.springboot.app.model.dao.IPensumDao;
import com.springboot.app.model.entities.Materia;
import com.springboot.app.model.entities.Pensum;
import com.springboot.app.service.IGestionMateriasService;

@Service
public class GestionMateriaServiceImp implements IGestionMateriasService{
	
	@Autowired
	private IMateriaDao materiadao;
	
	@Autowired
	private IPensumDao pensumDao;
	
	

	@Override
	public String registarMateria(int id, String codigo, String nombre, String descrpcion, String semestre,
			int creditos, int idPensum) {
		Optional<Pensum> pensum=pensumDao.findById(idPensum);
		if(pensum.isEmpty()) {
			return "No existe el pensum asociado, por favor corrija los datos";
		}
		if(materiadao.existsByCodigoAndPensum(codigo, pensum.get())) {
			return null;
		}
		return "";
	}

	@Override
	public String actualizarMateria(int id, String codigo, String nombre, String descrpcion, String semestre,
			int creditos, int pensun) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminarMateria(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materia> listarMaterias(String codigoPensum) {
		Optional<Pensum> opt=pensumDao.findByCodigo(codigoPensum);
		if(opt.isPresent()) {
			//List<Materia> materias=opt.get().getMaterias();
			//return materias;
			return null;
		}else {
			return null;
		}
		
		
	}

}
