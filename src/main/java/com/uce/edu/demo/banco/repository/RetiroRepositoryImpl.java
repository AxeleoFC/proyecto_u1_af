package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el retiro: "+r);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("retiro actualizada: "+r);
	}

	@Override
	public Retiro buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el retiro: "+fecha);
		Retiro r=new Retiro();
		return r;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos el retiro.");
	}


}
