package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void insertarRetiro(Retiro r);
	public void actualizar(Retiro r);
	public Retiro buscar(LocalDateTime fecha);
	public void eliminar(LocalDateTime fecha);
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaIni, LocalDateTime fechaFin);

}
