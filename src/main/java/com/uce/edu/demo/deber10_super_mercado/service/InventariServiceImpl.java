package com.uce.edu.demo.deber10_super_mercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber10_super_mercado.modelo.InventarioSM;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoNacional;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoPorProvincia;
import com.uce.edu.demo.deber10_super_mercado.repository.IInventarioRepository;

@Service
public class InventariServiceImpl implements IInventariService {

	@Autowired
	private IInventarioRepository inventariRepo;
	@Autowired
	private IProductoService productoService;
	@Autowired
	private ProductoNacional productoN;
	@Autowired
	private ProductoPorProvincia productoP;
	
	@Override
	public void crearInventario(InventarioSM i) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON: "+this.productoN);
		this.inventariRepo.crearI(i);
	}

	@Override
	public void eliminarInventario(String codInventario) {
		// TODO Auto-generated method stub
		this.inventariRepo.eliminarI(codInventario);
	}

	@Override
	public InventarioSM buscarInventario(String codInventario) {
		// TODO Auto-generated method stub
		return this.inventariRepo.buscarI(codInventario);
	}

	@Override
	public void actualizarInventario(InventarioSM i) {
		// TODO Auto-generated method stub
		this.inventariRepo.actualizarI(i);
	}

	@Override
	public void insertarProductoEnInventari(ProductoGeneral p) {
		// TODO Auto-generated method stub
		this.productoService.ingresarProducto(p);
		this.inventariRepo.insertarProducto(p);
	}

}
