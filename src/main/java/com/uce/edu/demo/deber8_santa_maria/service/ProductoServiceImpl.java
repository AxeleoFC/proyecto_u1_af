package com.uce.edu.demo.deber8_santa_maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;
import com.uce.edu.demo.deber8_santa_maria.modelo.repository.ProductoRepositoryImpl;
@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private ProductoRepositoryImpl productoRepo;

	@Override
	public void ingresarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.productoRepo.insertarP(p);
	}

	@Override
	public void eliminarProducto(String codProducto) {
		// TODO Auto-generated method stub
		this.productoRepo.eliminarP(codProducto);
	}

	@Override
	public Producto buscarPrroducto(String codProducto) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarP(codProducto);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizarP(p);
	}

}
