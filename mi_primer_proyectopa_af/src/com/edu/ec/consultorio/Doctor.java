package com.edu.ec.consultorio;

public class Doctor {
	private String nombre;
	private String apellido;
	
	
	
	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	//SEt y GET
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
