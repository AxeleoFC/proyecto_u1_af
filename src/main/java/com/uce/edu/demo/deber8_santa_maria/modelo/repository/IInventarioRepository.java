package com.uce.edu.demo.deber8_santa_maria.modelo.repository;

import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;

public interface IInventarioRepository {
	
	public void crearI(Inventario i);
	public void eliminarI(String codInventario);
	public Inventario buscarI(String codInventario);
	public void actualizarI(Inventario i);
	
	public void insertarProducto(Producto p);

}
