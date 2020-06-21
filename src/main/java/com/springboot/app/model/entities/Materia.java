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
@Table(name="materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idmateria")
	public String id;
	@Column(name="codigo")
	public String codigo;
	@Column(name="nombre")
	public String nombre;
	@Column(name="descripcion")
	public String descripcion;
	@Column(name="semestre")
	public String semestre;
	@Column(name="creditos")
	public String creditos;
	//@Column(name="idpensum")
	//public String idpensum;

}
