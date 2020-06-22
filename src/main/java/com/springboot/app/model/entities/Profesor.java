package com.springboot.app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idprofesor")
	public Integer id;
	
	@Column(name="documento")
	public String documento;
	
	@Column(name="nombre")
	public String nombre;
	
	@Column(name="direccion")
	public String direccion;
	
	@Column(name="datosprofesionales")
	public String datosprofesionales;
	
	@Column(name="codigo")
	public String codigo;
	
	@Column(name="password")
	public String password;
	
	@Column(name="correo")
	public String correo;

	
	@ManyToOne
	@JoinColumn(name="idPostGrado")
	public Postgrado postgrado;
	

}
