package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.deber10_super_mercado.modelo.InventarioSM;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoNacional;
import com.uce.edu.demo.deber10_super_mercado.modelo.ProductoPorProvincia;
import com.uce.edu.demo.deber10_super_mercado.service.IGestorInventarioService;
import com.uce.edu.demo.deber10_super_mercado.service.IInventariService;


@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	@Autowired
	private ProductoNacional nacional1;
	
	@Autowired
	private ProductoNacional nacional2;
	
	@Autowired
	private ProductoPorProvincia provincia1;
	
	@Autowired
	private ProductoPorProvincia provincia2;
	
	@Autowired
	private IInventariService inventariService;
	
	@Autowired
	private IGestorInventarioService gestionService;
	
	@Autowired
	private InventarioSM inventario;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.nacional1.setNombre("Pepsi");
		this.nacional1.setCodProducto("123");
		this.nacional1.setCantidad(50);
		this.nacional1.setPrecioU(new BigDecimal(1.25));
		this.nacional1.setFechaIngreso(LocalDateTime.of(2022, 05, 15, 13, 52, 12));
		
		System.out.println("-----------------------");
		System.out.println(this.nacional1);
		
		this.nacional2.setNombre("Cafe");
		this.nacional2.setCodProducto("567");
		this.nacional2.setCantidad(45);
		this.nacional2.setPrecioU(new BigDecimal(2.75));
		this.nacional2.setFechaIngreso(LocalDateTime.of(2022, 04, 10, 07, 30, 35));
		
		System.out.println("-----------------------");
		System.out.println(this.nacional2);
		
		this.provincia1.setNombre("Leche");
		this.provincia1.setCodProducto("857");
		this.provincia1.setCantidad(89);
		this.provincia1.setPrecioU(new BigDecimal(0.9));
		this.provincia1.setFechaIngreso(LocalDateTime.of(2022, 05, 03, 10, 50, 25));
		
		System.out.println("-----------------------");
		System.out.println(this.provincia1);
		
		this.provincia2.setNombre("Huevos");
		this.provincia2.setCodProducto("256");
		this.provincia2.setCantidad(255);
		this.provincia2.setPrecioU(new BigDecimal(0.150));
		this.provincia2.setFechaIngreso(LocalDateTime.of(2022, 05, 25, 16, 45, 24));
		
		System.out.println("-----------------------");
		System.out.println(this.provincia2+"\n");
		
		
		
		inventario.setCodInventario("K12");
		
		this.inventariService.crearInventario(inventario);
		this.inventariService.insertarProductoEnInventari(nacional1);
		this.inventariService.insertarProductoEnInventari(provincia1);
		this.inventariService.insertarProductoEnInventari(provincia2);
		this.inventariService.insertarProductoEnInventari(nacional2);
		
		System.out.println("-----------------------------------------");
		this.gestionService.imprimirReporteDeProductos(LocalDateTime.of(2022, 03
				, 10, 12, 35, 42));
	
	}

}
