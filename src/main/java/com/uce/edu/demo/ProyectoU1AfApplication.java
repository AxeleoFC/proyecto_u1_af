package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	//1) DI por atributo
	@Autowired
	CitaMedica cita;
	
	@Autowired
	CitaMedica2 cita2;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");
		
		String respuesta=cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta);
		
		String respuesta1=cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta1);
	}

}
