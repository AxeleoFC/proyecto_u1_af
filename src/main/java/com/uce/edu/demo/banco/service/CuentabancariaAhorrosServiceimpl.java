package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorros")
public class CuentabancariaAhorrosServiceimpl implements ICuentaBancariaService{
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCuenta(String numeroCuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		//Codigo duplicado, lo solucionamos con una fachada/gestor
		//CuentaBancaria cta=this.bancariaRepository.buscar(numeroCta);
		//BigDecimal saldo=new BigDecimal(12);
		BigDecimal interes=new BigDecimal(560).multiply(new BigDecimal(0.15));
		interes=interes.add(saldo.divide(new BigDecimal(100)));
		return interes;
	}

}
