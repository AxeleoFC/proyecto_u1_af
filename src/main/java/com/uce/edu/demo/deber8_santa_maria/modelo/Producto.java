package com.uce.edu.demo.deber8_santa_maria.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	private String nombre;
	private String codProducto;
	private LocalDateTime fechaIngreso;
	private int cantidad;
	private BigDecimal precioU;
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codProducto=" + codProducto + ", fechaIngreso=" + fechaIngreso
				+ ", cantidad=" + cantidad + ", precioU=" + precioU + "]";
	}
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioU() {
		return precioU;
	}
	public void setPrecioU(BigDecimal precioU) {
		this.precioU = precioU;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}
	

}
