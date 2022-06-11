package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	public void actualizar(LocalDateTime fechaTransferencia);
	public void eliminarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto, LocalDateTime fechaTransferencia);
	public Transferencia buscartransferencia(LocalDateTime fechaTransferencia);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin);

}
