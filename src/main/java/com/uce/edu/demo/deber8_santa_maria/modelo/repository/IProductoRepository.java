package com.uce.edu.demo.deber8_santa_maria.modelo.repository;

import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;

public interface IProductoRepository {
	
	public void insertarP(Producto p);
	public void eliminarP(String codProducto);
	public void actualizarP(Producto p);
	public Producto buscarP(String codProducto);

}
