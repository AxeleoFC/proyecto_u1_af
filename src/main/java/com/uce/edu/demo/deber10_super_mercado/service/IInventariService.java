package com.uce.edu.demo.deber10_super_mercado.service;

import com.uce.edu.demo.deber10_super_mercado.modelo.InventarioSM;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;

public interface IInventariService {
	
	public void crearInventario(InventarioSM i);
	public void eliminarInventario(String codInventario);
	public InventarioSM buscarInventario(String codInventario);
	public void actualizarInventario(InventarioSM i);
	
	public void insertarProductoEnInventari(ProductoGeneral p);

}
