package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.tienda.VenderProductoAtributos;
import com.uce.edu.demo.tienda.VenderProductoConstructor;
import com.uce.edu.demo.tienda.VenderProductoMetodoSET;

@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	//1) DI por atributo
	@Autowired
	CitaMedica cita;
	
	@Autowired
	CitaMedica2 cita2;
	
	//Tarea 5
	@Autowired
	VenderProductoAtributos venderAtributos;
	@Autowired
	VenderProductoConstructor venderConstructor;
	@Autowired
	VenderProductoMetodoSET venderMetodoSET;
		
	public void vender() {
		//1) DI por atributo
		venderAtributos.vender("Juan", "1234569876", "Chocolate", "A125", 1.15, "Michael", "3562A");
		//2) DI por constructor
		venderConstructor.vender("Jose", "1856726986", "Arroz", "C325", 10.50, "Maria", "6594B");
		//3) DI por metodos SET
		venderMetodoSET.vender("Marco", "1756984236", "Pollo", "M256", 7.75, "Pepe", "5369C");
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework");
//		
//		String respuesta=cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
//		System.out.println(respuesta);
//		
//		String respuesta1=cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
//		System.out.println(respuesta1);
		
		vender();
	}

}
