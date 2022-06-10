package com.edu.ec.consultorio;

import java.time.LocalDateTime;

public class MainCosultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CitaMedica cita1=new CitaMedica();
		cita1.agendar(LocalDateTime.now(), LocalDateTime.now(), "Juanito", "Teran", "Edison", 32, "PTE");
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita1.toString());
		
		CitaMedica cita2=new CitaMedica();
		cita2.agendar(LocalDateTime.now(), LocalDateTime.now(), "Josue", "Masabanda", "Edison", 10, "PP");
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita2.toString());
	}

}
