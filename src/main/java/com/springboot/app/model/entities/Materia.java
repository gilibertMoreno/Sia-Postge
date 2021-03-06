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
@Table(name="materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idmateria")
	public int id;
	
	@Column(name="codigo")
	public String codigo;
	
	@Column(name="nombre")
	public String nombre;
	
	@Column(name="descripcion")
	public String descripcion;
	
	@Column(name="semestre")
	public String semestre;
	
	@Column(name="creditos")
	public int creditos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpensum")
    public Pensum pensum;

}
