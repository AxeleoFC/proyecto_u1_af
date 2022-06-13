package com.uce.edu.demo.deber8_santa_maria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;
import com.uce.edu.demo.deber8_santa_maria.repository.IInventarioRepository;
@Service
public class InventariServiceImpl implements IInventariService {

	@Autowired
	private IInventarioRepository inventariRepo;
	@Autowired
	private IProductoService productoService;
	
	@Override
	public void crearInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.inventariRepo.crearI(i);
	}

	@Override
	public void eliminarInventario(String codInventario) {
		// TODO Auto-generated method stub
		this.inventariRepo.eliminarI(codInventario);
	}

	@Override
	public Inventario buscarInventario(String codInventario) {
		// TODO Auto-generated method stub
		return this.inventariRepo.buscarI(codInventario);
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.inventariRepo.actualizarI(i);
	}

	@Override
	public void insertarProductoEnInventari(Producto p) {
		// TODO Auto-generated method stub
		this.productoService.ingresarProducto(p);
		this.inventariRepo.insertarProducto(p);
	}

}
