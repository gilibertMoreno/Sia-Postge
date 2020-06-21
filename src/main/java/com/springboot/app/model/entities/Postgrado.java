package com.springboot.app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="postgrados")
public class Postgrado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPostGrado")
	public Integer id;
	@Column(name="nombre")
	public String nombre;
	@Column(name="descripcion")
	public String descripcion;
	@Column(name="fechainicio")
	public String fechainicio;
	@Column(name="fechafin")
	public String fechafin;
	@Column(name="requisitos")
	public String requisitos;
	@Column(name="codigo")
	public String codigo;
	
	//@Column(name="iddirector")
	//public String director;

}
