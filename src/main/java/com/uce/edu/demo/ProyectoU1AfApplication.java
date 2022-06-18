package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorGeneral general1;
	
	@Autowired
	private ProfesorMateria materia;
	
	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.general.setNombre("Jose");
		this.general.setApellido("Pepe");
		System.out.println("------------------"+"\nEjemplo Singleton");
		
		System.out.println(this.general);
		System.out.println("--------------");
		
		System.out.println(this.general1);
		this.general1.setNombre("Pepito");
		System.out.println("--------------");
		
		System.out.println(this.general);
		System.out.println("--------------");
		
		System.out.println(this.general1);
		
		System.out.println("------------------"+"\nEjemplo Prototype");
		
		this.materia.setNombre("Juan");
		this.materia.setApellido("Fernandez");
		System.out.println(this.materia);
		System.out.println("-----------------");
		System.out.println(this.materia1);
		
		System.out.println("-----------------");
		Matricula matricula=new Matricula();
		matricula.setEstudiante(new Estudiante());
		matricula.setMateria(new ArrayList<>());
		matricula.setNumero("1235");
		this.iMatriculaService.ingresarMatricula(matricula);
	}

}
