package com.uce.edu.demo.tienda;

import org.springframework.stereotype.Component;
//Uso de IoC
@Component
public class Producto {
	
	private String nombreProdu;
	private String codProducto;
	private Double precio;
	
	@Override
	public String toString() {
		return "Producto [nombre del producto=" + nombreProdu + ", codigo de producto=" 
	+ codProducto + ", precio=" + precio + "]";
	}
	
	//SET y GET
	public String getNombreProdu() {
		return nombreProdu;
	}
	public void setNombreProdu(String nombreProdu) {
		this.nombreProdu = nombreProdu;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
