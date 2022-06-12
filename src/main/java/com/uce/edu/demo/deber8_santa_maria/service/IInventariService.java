package com.uce.edu.demo.deber8_santa_maria.service;

import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;

public interface IInventariService {
	
	public void crearInventario(Inventario i);
	public void eliminarInventario(String codInventario);
	public Inventario buscarInventario(String codInventario);
	public void actualizarInventario(Inventario i);
	
	public void insertarProductoEnInventari(Producto p);

}
