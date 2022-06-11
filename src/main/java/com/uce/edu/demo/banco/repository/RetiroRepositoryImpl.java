package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui debe estar el SQL a la base
		List<Retiro> listaConsultada=new ArrayList<>();
		
		Retiro repo1=new Retiro();
		repo1.setFecha(LocalDateTime.of(2022, 8, 9, 2, 25, 12));
		repo1.setMonto(new BigDecimal(500));
		repo1.setNumeroCuenta("1234");
		
		Retiro repo2=new Retiro();
		repo2.setFecha(LocalDateTime.of(2022, 6, 3, 55, 45, 25));
		repo2.setMonto(new BigDecimal(400));
		repo2.setNumeroCuenta("1894");
		
		listaConsultada.add(repo1);
		listaConsultada.add(repo2);
						
		return listaConsultada;
	}


}
