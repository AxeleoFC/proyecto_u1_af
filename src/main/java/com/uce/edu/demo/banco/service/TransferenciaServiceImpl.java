package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	
	/*Como la logica de CuentaBancaria no hace nada
	Si puedo inyectar el CuentaBancariaRepository*/
	
	@Autowired
	@Qualifier("ahorros")
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

	@Override
	public void actualizar(LocalDateTime fechaTransferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(fechaTransferencia);
	}

	@Override
	public void eliminarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto, LocalDateTime fechaTransferencia) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen= this.bancariaService.buscar(cuentaOrigen);
		BigDecimal saldoOrigen=cOrigen.getSaldo();
		BigDecimal nuevoSaldo=saldoOrigen.add(monto);
		cOrigen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino= this.bancariaService.buscar(cuentaDestino);
		BigDecimal saldoDestino=cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino=saldoDestino.subtract(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t=this.transferenciaRepository.buscarT(fechaTransferencia);
		
		this.transferenciaRepository.eliminar(t);;
	}

	@Override
	public Transferencia buscartransferencia(LocalDateTime fechaTransferencia) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.buscarT(fechaTransferencia);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//No hay ninguna logica de negocio
		return this.transferenciaRepository.consultar(cuenta, fechaIni, fechaFin);
	}

}
