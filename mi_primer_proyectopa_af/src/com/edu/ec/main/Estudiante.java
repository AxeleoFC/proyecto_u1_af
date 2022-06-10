package com.edu.ec.main;

public class Estudiante {
	private String nombre;
	private String apellido;
	
	public String obtenerNombreCompleto() {
		return this.nombre+" "+this.apellido;
	}
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
