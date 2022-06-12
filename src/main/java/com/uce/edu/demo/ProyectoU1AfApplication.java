package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;
import com.uce.edu.demo.deber8_santa_maria.service.IGestorInventarioService;
import com.uce.edu.demo.deber8_santa_maria.service.IInventariService;

@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	@Autowired
	private IInventariService inventariService;
	@Autowired
	private IGestorInventarioService gestionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Producto p1=new Producto();
		p1.setNombre("Pepsi");
		p1.setCodProducto("123");
		p1.setCantidad(50);
		p1.setPrecioU(new BigDecimal(1.25));
		p1.setFechaIngreso(LocalDateTime.of(2022, 05, 15, 13, 52, 12));
		
		Producto p2=new Producto();
		p2.setNombre("Cafe");
		p2.setCodProducto("567");
		p2.setCantidad(45);
		p2.setPrecioU(new BigDecimal(2.75));
		p2.setFechaIngreso(LocalDateTime.of(2022, 04, 10, 07, 30, 35));
		
		Producto p3=new Producto();
		p3.setNombre("Leche");
		p3.setCodProducto("857");
		p3.setCantidad(89);
		p3.setPrecioU(new BigDecimal(0.90));
		p3.setFechaIngreso(LocalDateTime.of(2022, 05, 03, 10, 50, 25));
		
		Producto p4=new Producto();
		p4.setNombre("Huevos");
		p4.setCodProducto("256");
		p4.setCantidad(255);
		p4.setPrecioU(new BigDecimal(0.15));
		p4.setFechaIngreso(LocalDateTime.of(2022, 05, 25, 16, 45, 24));
		
		Producto p5=new Producto();
		p5.setNombre("Arroz");
		p5.setCodProducto("896");
		p5.setCantidad(142);
		p5.setPrecioU(new BigDecimal(5.75));
		p5.setFechaIngreso(LocalDateTime.of(2021, 12, 10, 16, 32, 39));
		
		Inventario i1=new Inventario();
		i1.setCodInventario("K12");
		this.inventariService.crearInventario(i1);
		this.inventariService.insertarProductoEnInventari(p1);
		this.inventariService.insertarProductoEnInventari(p2);
		this.inventariService.insertarProductoEnInventari(p3);
		this.inventariService.insertarProductoEnInventari(p4);
		this.inventariService.insertarProductoEnInventari(p5);
		
		this.gestionService.gestioninventario(inventariService);
		System.out.println("-----------------------------------------");
		this.gestionService.imprimirReporteDeProductos(LocalDateTime.of(2022, 03
				, 10, 12, 35, 42));
		
	}

}
