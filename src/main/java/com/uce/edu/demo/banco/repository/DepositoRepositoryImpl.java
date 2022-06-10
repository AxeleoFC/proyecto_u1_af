package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+d);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito actualizada: "+d);
	}

	@Override
	public Deposito buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito: "+fecha);
		Deposito d=new Deposito();
		return d;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos el deposito");
	}

}
