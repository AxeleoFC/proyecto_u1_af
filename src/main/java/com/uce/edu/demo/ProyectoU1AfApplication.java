package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.tienda.VenderProductoAtributos;
import com.uce.edu.demo.tienda.VenderProductoConstructor;
import com.uce.edu.demo.tienda.VenderProductoMetodoSET;

@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante e=new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1478523690");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1=new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Cabezas");
		e1.setCedula("0236598741");
		this.estudianteService.ingresarEstudiante(e1);
		
		//Usar los 3 metdos restantes
		e.setCedula("1236054789");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("1478523690");
	}

}
