package com.uce.edu.demo.deber8_santa_maria.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;
@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {
	
	//Objeto Inventari creado para interactuar con los datos con mas facilidad
	private Inventario inventaro=new Inventario();

	@Override
	public void crearI(Inventario i) {
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
	public Inventario buscarI(String codInventario) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado el inventario en la base de datos: "+this.inventaro);
		return this.inventaro;
	}

	@Override
	public void actualizarI(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando inventario: "+this.inventaro);
		this.inventaro.setCodInventario(i.getCodInventario());
		this.inventaro.setProductosEnInventari(i.getProductosEnInventari());
		System.out.println("Se actualizo el inventario en la base de datos: "+this.inventaro);
	}

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.inventaro.getProductosEnInventari().add(p);
	}


}
