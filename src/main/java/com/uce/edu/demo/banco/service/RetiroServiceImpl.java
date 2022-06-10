package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
@Service
public class RetiroServiceImpl implements IRetiroService {
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void realizarRetiro(String numCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaOrigen=this.bancariaService.buscar(numCtaDestino);
		BigDecimal saldoCtaOrigen=ctaOrigen.getSaldo();
		BigDecimal saldoFinal=saldoCtaOrigen.subtract(monto);
		ctaOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaOrigen);
		
		Retiro retiro=new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setMonto(monto);
		retiro.setNumeroCuenta(numCtaDestino);
		this.retiroRepository.insertarRetiro(retiro);
	}

	@Override
	public Retiro buscarRetiro(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(fecha);
	}

	@Override
	public void eliminarRetiro(String numCtaDestino, LocalDateTime fecha, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino=this.bancariaService.buscar(numCtaDestino);
		BigDecimal saldoCtaDestino=ctaDestino.getSaldo();
		BigDecimal saldoFinal=saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		this.retiroRepository.eliminar(fecha);
	}

	@Override
	public void actualizarRetiro(String numCtaDestino, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
		CuentaBancaria ctaOrigen=this.bancariaService.buscar(numCtaDestino);
		
		Retiro retiro=new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setMonto(ctaOrigen.getSaldo());
		retiro.setNumeroCuenta(ctaOrigen.getNumero());
		this.retiroRepository.actualizar(retiro);
	}

}
