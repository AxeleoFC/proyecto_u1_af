package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se a realizado la transferencia "+t);
	}

	@Override
	public void actualizar(LocalDateTime fechaTransferencia) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia actualizada a: "+fechaTransferencia);
	}

	@Override
	public Transferencia buscarT(LocalDateTime fechaTransferencia) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la transferencia: "+fechaTransferencia);
		Transferencia t=new Transferencia();
		t.setFechaTransferencia(fechaTransferencia);
		return t;
	}

	@Override
	public void eliminar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos la trasferencia");
	}

}
