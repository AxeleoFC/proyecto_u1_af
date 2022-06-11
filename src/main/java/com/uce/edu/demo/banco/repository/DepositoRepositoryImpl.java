package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui debe estar el SQL a la base
		List<Deposito> listaConsultada=new ArrayList<>();
		
		Deposito depo1=new Deposito();
		depo1.setFecha(LocalDateTime.of(2022, 2, 10, 8, 50, 25));
		depo1.setMonto(new BigDecimal(100));
		depo1.setNumeroCuenta("2334");
		
		Deposito depo2=new Deposito();
		depo2.setFecha(LocalDateTime.of(2022, 4, 5, 7, 30, 57));
		depo2.setMonto(new BigDecimal(150));
		depo2.setNumeroCuenta("1684");
		
		listaConsultada.add(depo1);
		listaConsultada.add(depo2);
				
		return listaConsultada;
	}

}
