package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Component;
//Uso de IoC
@Component
public class Vendedor {
	
	private String nombre;
	private String codVendedor;
	
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", codigo de vendedor=" + codVendedor + "]";
	}
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(String codVendedor) {
		this.codVendedor = codVendedor;
	}
}