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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="estudiantespostgrado")
public class EstudiantePostgrado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idestudiantespostgrado")
	public String id;
	
	@Column(name="fechainicio")
	public String fechainicio;
	
	@Column(name="fechafin")
	public String fechafin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idPostGrado")
	public Postgrado PostGrado;
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="idEstudiante")
	public Estudiante estudiante;
	
}
