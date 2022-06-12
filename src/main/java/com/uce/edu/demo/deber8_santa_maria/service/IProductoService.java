package com.uce.edu.demo.deber8_santa_maria.service;

import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;

public interface IProductoService {
	
	public void ingresarProducto(Producto p);
	public void eliminarProducto(String codProducto);
	public Producto buscarPrroducto(String codProducto);
	public void actualizarProducto(Producto p);

}
