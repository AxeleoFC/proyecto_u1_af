package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class FachadaCuentaBancariaImpl implements IFachadaCuentaBancaria {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaServiceC;
	
	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService bancariaServiceF;
	
	@Override
	public BigDecimal calcularinteres(String numeroCta) {
		// TODO Auto-generated method stub
		CuentaBancaria cta=this.bancariaRepository.buscar(numeroCta);
		BigDecimal interes=null;
		
		if(cta.getTipo().equals("A")) {
			//Ahorros
			interes=this.bancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		}else if(cta.getTipo().equals("C")){
			//Corriente
			interes=this.bancariaServiceC.calcularInteres(numeroCta, cta.getSaldo());
		}else if(cta.getTipo().equals("F")) {
			//Futuro
			interes=this.bancariaServiceF.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}

}
