package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void insertar(Transferencia t);
	public void actualizar(LocalDateTime fechaTransferencia);
	public Transferencia buscarT(LocalDateTime fechaTransferencia);
	public void eliminar(Transferencia t);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin);

}
