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
@Table(name="materiasestudiante")
public class MateriasEstudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idmateriaspensum")
	public int idmateriaspensum ;
	
	@Column(name="fecha")
	public String fecha;
	
	@Column(name="nota1")
	public float nota1;
	
	@Column(name="nota2")
	public float nota2;
	
	@Column(name="nota3")
	public float nota3;
	
	@Column(name="examen")
	public float examen;
	
	@Column(name="notafinal")
	public float notafinal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigomateria")
	public Materia materia;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idestudiantespostgrado")
	public Postgrado postgrado;

}
