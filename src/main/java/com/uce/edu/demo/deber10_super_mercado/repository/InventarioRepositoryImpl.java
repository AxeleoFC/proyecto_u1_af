package com.uce.edu.demo.deber10_super_mercado.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber10_super_mercado.modelo.InventarioSM;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {
	
	//Objeto Inventari creado para interactuar con los datos con mas facilidad
	@Autowired
	private InventarioSM inventaro;

	@Override
	public void crearI(InventarioSM i) {
		// TODO Auto-generated method stub
		System.out.println("Se a creado el inventario en la base de datos: "+i);
		this.inventaro=i;
		this.inventaro.setProductosEnInventari(new ArrayList<>());
	}

	@Override
	public void eliminarI(String codInventario) {
		// TODO Auto-generated method stub
		System.out.println("Se a eliminado el inventario en la base de datos: "+codInventario);
	}

	@Override
	public InventarioSM buscarI(String codInventario) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado el inventario en la base de datos: "+this.inventaro);
		return this.inventaro;
	}

	@Override
	public void actualizarI(InventarioSM i) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando inventario: "+this.inventaro);
		this.inventaro.setCodInventario(i.getCodInventario());
		this.inventaro.setProductosEnInventari(i.getProductosEnInventari());
		System.out.println("Se actualizo el inventario en la base de datos: "+this.inventaro);
	}

	@Override
	public void insertarProducto(ProductoGeneral p) {
		// TODO Auto-generated method stub
		this.inventaro.getProductosEnInventari().add(p);
	}


}
