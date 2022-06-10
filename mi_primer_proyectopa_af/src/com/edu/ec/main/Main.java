package com.edu.ec.main;

public class Main {
	
	private Estudiante estu2;
	
	public static void main(String[]args) {
		Estudiante estu1=new Estudiante();
		estu1.setNombre("Axel");
		estu1.setApellido("Flores");
		System.out.println(estu1.obtenerNombreCompleto());
	}

}
