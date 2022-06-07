package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia e) {
		// TODO Auto-generated method stub
		//Aqui se realiza la insercion en la BD
		System.out.println("Se ha insertado en la base de datos a la materia "+e);
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		//Aqui se realiza la busqueda en la BD
		System.out.println("Se ha buscado en la base de datos a la materia "+nombre);
		Materia m=new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		//Aqui se realiza la actualizacion en la BD
		System.out.println("Se ha actualizado en la base de datos a la materia "+e);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		//Aqui se realiza la eliminacion en la BD
		System.out.println("Se ha eliminado en la base de datos a la materia "+nombre);
	}

}
