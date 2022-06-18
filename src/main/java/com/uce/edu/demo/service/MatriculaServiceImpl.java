package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
//		ProfesorMateria profeM=new ProfesorMateria();
//		profeM.setApellido("Jorge");
//		profeM.setNombre("Pepe");
		return null;
	}
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}

	@Override
	public void ingresarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON: "+this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE: "+this.profesorMateria);
		
		System.out.println("DI un metodo General: "+this.obtenerProfesorG());
		System.out.println("DI un metodo Materia: "+this.obtenerProfesorM());
		
		this.matriculaRepository.insertar(ma);;
	}

	@Override
	public void buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(ma);;
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);;
	}

}
