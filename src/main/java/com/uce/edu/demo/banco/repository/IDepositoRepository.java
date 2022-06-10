package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	
	public void insertarDeposito(Deposito d);
	public void actualizar(Deposito d);
	public Deposito buscar(LocalDateTime fecha);
	public void eliminar(LocalDateTime fecha);

}
