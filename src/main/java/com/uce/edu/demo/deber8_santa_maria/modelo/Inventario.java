package com.uce.edu.demo.deber8_santa_maria.modelo;

import java.util.List;

public class Inventario {
	private String codInventario;
	private List<Producto> productosEnInventari;
	
	@Override
	public String toString() {
		return "Inventario [codInventario=" + codInventario + ", productosEnInventari=" + productosEnInventari + "]";
	}
	
	//SET y GET
	public String getCodInventario() {
		return codInventario;
	}
	public void setCodInventario(String codInventario) {
		this.codInventario = codInventario;
	}
	public List<Producto> getProductosEnInventari() {
		return productosEnInventari;
	}
	public void setProductosEnInventari(List<Producto> productosEnInventari) {
		this.productosEnInventari = productosEnInventari;
	}

}
