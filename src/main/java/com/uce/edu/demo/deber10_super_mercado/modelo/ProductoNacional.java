package com.uce.edu.demo.deber10_super_mercado.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ProductoNacional extends ProductoGeneral{

	
	@Override
	public String toString() {
		return "ProductoNacional [nombre=" + super.getNombre() + ", codProducto=" + super.getCodProducto() + ", fechaIngreso=" + super.getFechaIngreso()
				+ ", cantidad=" + super.getCantidad() + ", precioU=" + super.getPrecioU() + "]";
	}

}
