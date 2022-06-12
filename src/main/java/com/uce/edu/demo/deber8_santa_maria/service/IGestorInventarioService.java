package com.uce.edu.demo.deber8_santa_maria.service;

import java.time.LocalDateTime;

public interface IGestorInventarioService {
	
	public void imprimirReporteDeProductos(LocalDateTime fechaInicio);
	
	//Metodo creado para enlazar las capaz service de inventario
	//ya que no se puede acceder a la base de datos
	public void gestioninventario(IInventariService i);

}
