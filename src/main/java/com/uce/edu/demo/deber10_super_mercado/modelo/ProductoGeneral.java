package com.uce.edu.demo.deber10_super_mercado.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class ProductoGeneral {
	private String nombre;
	private String codProducto;
	private LocalDateTime fechaIngreso;
	private int cantidad;
	private BigDecimal precioU;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
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
	
	
}
