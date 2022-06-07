package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AfApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
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
		
		//Usar los 3 metdos restantes
		e.setCedula("1236054789");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("1478523690");
		
		System.out.println("Tarea 6");
		
		Materia m=new Materia();
		m.setNombre("Programacion avanzada II");
		m.setSemestre("Sexto");
		
		this.materiaService.ingresarMateria(m);
		m.setSemestre("Quinto");
		this.materiaService.actualizarMateria(m);
		this.materiaService.buscarMateria("Programacion avanzada II");
		this.materiaService.borrarMateria("Programacion avanzada II");
		
		Matricula ma=new Matricula();
		ma.setEstudiante(e);
		List<Materia> listaMate=new ArrayList<>();
		listaMate.add(m);
		ma.setMateria(listaMate);
		ma.setNumero("12548");
		
		this.matriculaService.ingresarMatricula(ma);
		ma.setNumero("12356");
		this.matriculaService.actualizarMatricula(ma);
		this.matriculaService.buscarMatricula("12548");
		this.matriculaService.borrarMatricula("12548");
		
	}

}
