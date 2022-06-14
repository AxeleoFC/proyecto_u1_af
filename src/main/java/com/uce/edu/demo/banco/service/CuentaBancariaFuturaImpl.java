package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("futuro")
public class CuentaBancariaFuturaImpl  implements ICuentaBancariaService{

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
		BigDecimal interes=saldo.multiply(new BigDecimal(0.25));
		return interes;
	}

}
