package com.uce.edu.demo.deber10_super_mercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;
import com.uce.edu.demo.deber10_super_mercado.repository.ProductoRepositoryImpl;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private ProductoRepositoryImpl productoRepo;

	@Override
	public void ingresarProducto(ProductoGeneral p) {
		// TODO Auto-generated method stub
		this.productoRepo.insertarP(p);
	}

	@Override
	public void eliminarProducto(String codProducto) {
		// TODO Auto-generated method stub
		this.productoRepo.eliminarP(codProducto);
	}

	@Override
	public ProductoGeneral buscarPrroducto(String codProducto) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarP(codProducto);
	}

	@Override
	public void actualizarProducto(ProductoGeneral p) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizarP(p);
	}

}
