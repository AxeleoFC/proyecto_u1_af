package com.edu.ec.consultorio.di.herencia;

import java.time.LocalDateTime;

import com.edu.ec.consultorio.PacientePediatria;
import com.edu.ec.consultorio.PacienteTerceraEdad;

public class MainFramework {
	public static void main(String[] args) {
		CitaMedica cita1=new CitaMedica();
		PacienteTerceraEdad paciente1=new PacienteTerceraEdad();
		paciente1.setNombre("Edison");
		paciente1.setEdad(30);
		paciente1.setCodJubilacion("123321");
		cita1.agendar(LocalDateTime.now(), LocalDateTime.now(), "Juanito", "Teran", paciente1);
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita1.toString());
		
		CitaMedica cita2=new CitaMedica();
		PacientePediatria paciente2=new PacientePediatria();
		paciente2.setNombre("Jasue");
		paciente2.setEdad(10);
		paciente2.setCantVacunas(5);
		cita2.agendar(LocalDateTime.now(), LocalDateTime.now(), "Josue", "Masabanda", paciente2);
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita2.toString());
	}

}
