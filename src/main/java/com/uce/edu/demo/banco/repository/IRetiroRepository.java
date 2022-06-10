package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void insertarRetiro(Retiro r);
	public void actualizar(Retiro r);
	public Retiro buscar(LocalDateTime fecha);
	public void eliminar(LocalDateTime fecha);

}
