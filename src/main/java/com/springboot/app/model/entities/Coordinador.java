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
@Table (name="director")
public class Coordinador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddirector")
	public Integer iddirector;
	@Column(name="correo")
	private String correo;
	@Column(name="password")
	private String password;
	@Column(name="documento")
	private String documento;
	@Column(name="codigo")
	private String codigo;
	@Column(name="nombre")
	private String nombre;
	

}
