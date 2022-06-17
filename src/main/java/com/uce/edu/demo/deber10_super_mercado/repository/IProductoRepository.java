package com.uce.edu.demo.deber10_super_mercado.repository;

import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;

public interface IProductoRepository {
	
	public void insertarP(ProductoGeneral p);
	public void eliminarP(String codProducto);
	public void actualizarP(ProductoGeneral p);
	public ProductoGeneral buscarP(String codProducto);

}
