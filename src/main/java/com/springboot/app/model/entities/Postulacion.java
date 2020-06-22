package com.springboot.app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="postulaciones")
public class Postulacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpostulaciones")
	public int id;
	
	@Column(name="fecha")
	public String fecha;
	
	@Column(name="documentos")
	public String documentos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idaspirante")
	public Aspirante aspirante;
	
	@ManyToOne(fetch = FetchType.LAZY)	
	@JoinColumn(name="idPostGrado")
	public Postgrado postgrado;
	
	@Column(name="consignacionping")
	public String consignacionping;
	
	@Column(name="estado")
	public String estado;	
	
	@Column(name="consignacionmatricula")
	public String consignacionmatricula;
	
	@Column(name="anexo")
	public String anexo;
	
}
