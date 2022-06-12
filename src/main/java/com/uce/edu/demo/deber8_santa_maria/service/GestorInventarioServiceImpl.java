package com.uce.edu.demo.deber8_santa_maria.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService{
	@Autowired
	private IInventariService inventarioService;

	@Override
	public void imprimirReporteDeProductos(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		System.out.println("REPORTE DE LOS PRODUCTOS");
		System.out.println("Nombre del producto – Cantidad – Precio Venta – Fecha de ingreso a bodega");
		
		Inventario inventari=inventarioService.buscarInventario(null);
		
		for(Producto p:inventari.getProductosEnInventari()) {
			
			if(fechaInicio.compareTo(p.getFechaIngreso())<0) {
				Producto precioN=calculoVenta(p);
				System.out.println(precioN.getNombre()+" - "+precioN.getCantidad()+" - "+precioN.getPrecioU()+" - "+precioN.getFechaIngreso());
			}
		}
	}
	
	private Producto calculoVenta(Producto p) {
		Producto productoR=p;
		
		double pv;
		
		double pc=p.getPrecioU().doubleValue();
		
		double g=pc*0.1;
		
		double iva=pc*0.12;
		
		pv=pc+g+iva;
		
		productoR.setPrecioU(new BigDecimal(pv).setScale(2, RoundingMode.HALF_UP));
		return productoR;
	}
	
	//Metodo creado para enlazar las capaz service de inventario
	//ya que no se puede acceder a la base de datos
	public void gestioninventario(IInventariService i) {
		this.inventarioService=i;
	}

}
