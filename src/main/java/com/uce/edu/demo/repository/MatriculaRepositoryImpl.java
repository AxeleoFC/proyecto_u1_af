package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula e) {
		// TODO Auto-generated method stub
		//Aqui se realiza la insercion en la BD
		System.out.println("Se ha insertado en la base de datos a la matricula "+e);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		//Aqui se realiza la busqueda en la BD
		System.out.println("Se ha buscado en la base de datos a la matricula "+numero);
		Matricula ma=new Matricula();
		ma.setNumero(numero);;
		return ma;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		//Aqui se realiza la actualizacion en la BD
		System.out.println("Se ha actualizado en la base de datos a la matricula "+e);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		//Aqui se realiza la eliminacion en la BD
		System.out.println("Se ha eliminado en la base de datos a la matricula "+numero);
	}

}
