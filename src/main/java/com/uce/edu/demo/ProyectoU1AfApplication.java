package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.deber8_santa_maria.modelo.Inventario;
import com.uce.edu.demo.deber8_santa_maria.modelo.Producto;
import com.uce.edu.demo.deber8_santa_maria.service.IGestorInventarioService;
import com.uce.edu.demo.deber8_santa_maria.service.IInventariService;

@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		BigDecimal interes=this.bancaria.calcularinteres("132");
		System.out.println("Corriente");
		System.out.println(interes);
		
	}

}
