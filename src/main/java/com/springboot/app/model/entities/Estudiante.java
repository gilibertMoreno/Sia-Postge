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
@Table(name="estudiantes")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idestudiante")
	public Integer id;
	
	@Column(name="codigo")
	public String codigo;
	
	@Column(name="nombre")
	public String nombre;
	@Column (name="documento")
	public String documento;
	@Column(name="correo")
	public String correo;
	@Column(name="telefono")
	public String telefono;
	@Column(name="password")
	public String password;
	

}
