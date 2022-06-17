package com.uce.edu.demo.deber10_super_mercado.modelo;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class InventarioSM {
	private String codInventario;
	private List<ProductoGeneral> productosEnInventari;
	
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
	public List<ProductoGeneral> getProductosEnInventari() {
		return productosEnInventari;
	}
	public void setProductosEnInventari(List<ProductoGeneral> productosEnInventari) {
		this.productosEnInventari = productosEnInventari;
	}

}
