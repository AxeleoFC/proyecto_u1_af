package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Component;
//Uso de IoC
@Component
public class Cliente {
	
	private String nombre;
	private String cedula;
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
