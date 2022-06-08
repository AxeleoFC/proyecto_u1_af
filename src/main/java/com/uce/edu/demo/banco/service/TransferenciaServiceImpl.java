package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	
	/*Como la logica de CuentaBancaria no hace nada
	Si puedo inyectar el CuentaBancariaRepository*/
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository transferenciaRepository;

	@Override
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cOrigen= this.bancariaService.buscar(cuentaOrigen);
		BigDecimal saldoOrigen=cOrigen.getSaldo();
		//Metodo para restar en BigDecimal
		BigDecimal nuevoSaldo=saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino= this.bancariaService.buscar(cuentaDestino);
		BigDecimal saldoDestino=cDestino.getSaldo();
		//Metodo para aumentar en BigDecimal
		BigDecimal nuevoSaldoDestino=saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t=new Transferencia();
		t.setNumeroCuentaOrigen(cuentaOrigen);
		t.setNumeroCuentaDestino(cuentaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.transferenciaRepository.insertar(t);
	}

}