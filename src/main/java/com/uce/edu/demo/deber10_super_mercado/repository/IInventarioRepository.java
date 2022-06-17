package com.uce.edu.demo.deber10_super_mercado.repository;

import com.uce.edu.demo.deber10_super_mercado.modelo.InventarioSM;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;

public interface IInventarioRepository {
	
	public void crearI(InventarioSM i);
	public void eliminarI(String codInventario);
	public InventarioSM buscarI(String codInventario);
	public void actualizarI(InventarioSM i);
	
	public void insertarProducto(ProductoGeneral p);

}
