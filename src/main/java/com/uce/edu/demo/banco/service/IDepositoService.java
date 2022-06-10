package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {
	
	public void realizarDeposito(String numCtaDestino, BigDecimal monto);
	public Deposito buscarDeposito(LocalDateTime fecha);
	public void eliminarDeposito(String numCtaDestino, LocalDateTime fecha, BigDecimal monto);
	public void actualizarDeposito(Deposito d);

}
