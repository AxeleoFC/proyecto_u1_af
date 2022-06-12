package com.uce.edu.demo.deber8_santa_maria.modelo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertarP(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se a ingresado el producto en la base de datos: "+p);
	}

	@Override
	public void eliminarP(String codProducto) {
		// TODO Auto-generated method stub
		System.out.println("Se a eliminado el producto en la base de datos con codigo: "+codProducto);
	}

	@Override
	public void actualizarP(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado el producto en la base de datos: "+p);
	}

	@Override
	public Producto buscarP(String codProducto) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado el producto en la base de datos con codigo: "+codProducto);
		return null;
	}

}
