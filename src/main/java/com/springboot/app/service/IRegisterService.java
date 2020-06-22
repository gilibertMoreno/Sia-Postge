package com.springboot.app.service;

public interface IRegisterService {
	public String registrarCoordinador(int id,String correo,String password,String documento,String codigo,String nombre);
	public String registrarEstudiante(int id,String codigo,String nombre,String documento,String correo,String telefono,String password);
	public String registrarrpfesor(int id,String documento,String nombre,String direccion,String datosprofesionales,String password,String codigo,String correo);
	public String registrarAspirante(int id, String nombre, String documento, String fecha, String correo, String telefono, String password);
}
