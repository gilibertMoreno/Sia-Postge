package com.springboot.app.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name="pensum")
public class Pensum {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpensum")
	public Integer id;
	@Column(name="identificador")
	public Integer nombre;
	@Column(name="codigo")
	private String codigo;
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fecha")
	private String fecha;
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pensum")
	//private List<Materia> materias;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="idPostGrado")
	private Postgrado postgrado;

}
