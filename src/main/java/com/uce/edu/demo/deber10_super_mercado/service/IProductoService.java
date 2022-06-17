package com.uce.edu.demo.deber10_super_mercado.service;

import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;

public interface IProductoService {
	
	public void ingresarProducto(ProductoGeneral p);
	public void eliminarProducto(String codProducto);
	public ProductoGeneral buscarPrroducto(String codProducto);
	public void actualizarProducto(ProductoGeneral p);

}
