package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui debe estar el SQL a la base
		List<Transferencia> listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		listaConsultada.add(trans1);
		
		return listaConsultada;
	}

}
