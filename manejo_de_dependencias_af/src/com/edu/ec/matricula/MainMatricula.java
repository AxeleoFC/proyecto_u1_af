package com.edu.ec.matricula;

import java.time.LocalDateTime;

public class MainMatricula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matricula matricula1=new Matricula();
		matricula1.matricular("Axel", "Flores", LocalDateTime.of(2000, 06, 28, 22, 56), 
				"Programación Avanzada II", 210, LocalDateTime.now());
		System.out.println(matricula1.toString());

	}

}
