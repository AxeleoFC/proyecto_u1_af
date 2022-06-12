package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	
	public void realizarRetiro(String numCtaDestino, BigDecimal monto);
	public Retiro buscarRetiro(LocalDateTime fecha);
	public void eliminarRetiro(String numCtaDestino, LocalDateTime fecha, BigDecimal monto);
	public void actualizarRetiro(String numCtaDestino, LocalDateTime fecha);

}