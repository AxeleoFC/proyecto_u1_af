package com.uce.edu.demo.deber10_super_mercado.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber10_super_mercado.modelo.InventarioSM;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoGeneral;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService{
	@Autowired
	private IInventariService inventarioService;

	@Override
	public void imprimirReporteDeProductos(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		System.out.println("REPORTE DE LOS PRODUCTOS");
		System.out.println("Nombre del producto – Cantidad – Precio Venta – Fecha de ingreso a bodega");
		
		InventarioSM inventari=inventarioService.buscarInventario(null);
		
		for(ProductoGeneral p:inventari.getProductosEnInventari()) {
			
			if(fechaInicio.compareTo(p.getFechaIngreso())<0) {
				ProductoGeneral precioN=calculoVenta(p);
				System.out.println(precioN.getNombre()+" - "+precioN.getCantidad()+" - "+precioN.getPrecioU()+" - "+precioN.getFechaIngreso());
			}
		}
	}
	
	private ProductoGeneral calculoVenta(ProductoGeneral p) {
		ProductoGeneral productoR=p;
		
		BigDecimal pv=new BigDecimal(0);
		
		BigDecimal pc=productoR.getPrecioU();
		
		BigDecimal g=productoR.getPrecioU().multiply(new BigDecimal(0.1));
		
		BigDecimal iva=productoR.getPrecioU().multiply(new BigDecimal(0.12));
		
		pv=pv.add(pc).add(g).add(iva);
		
		productoR.setPrecioU(pv.setScale(2, RoundingMode.HALF_UP));
		return productoR;
	}

}
