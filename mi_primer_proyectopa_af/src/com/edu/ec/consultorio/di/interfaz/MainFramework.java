package com.edu.ec.consultorio.di.interfaz;

import java.time.LocalDateTime;

public class MainFramework {
	public static void main(String[] args) {
		CitaMedica cita1=new CitaMedica();
		IPaciente paciente1=new PacienteTerceraEdadI();
		paciente1.setNombre("Edison");
		paciente1.setEdad(30);
		
		cita1.agendar(LocalDateTime.now(), LocalDateTime.now(), "Juanito", "Teran", paciente1);
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita1.toString());
		
		//**********PacientePediatria
		CitaMedica cita2=new CitaMedica();
		IPaciente paciente2=new PacientePediatraI();
		paciente2.setNombre("Jasue");
		paciente2.setEdad(10);
		
		cita2.agendar(LocalDateTime.now(), LocalDateTime.now(), "Josue", "Masabanda", paciente2);
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita2.toString());
		

		//**********PacienteOdontologia
		CitaMedica cita3=new CitaMedica();
		IPaciente paciente3=new IPaciente() {
			
			@Override
			public void setNombre(String nombre) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEdad(Integer edad) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getNombre() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer getEdad() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		paciente3.setNombre("Jasue");
		paciente3.setEdad(10);
		
		cita2.agendar(LocalDateTime.now(), LocalDateTime.now(), "David", "Ruiz", paciente3);
		
		System.out.println("La cita  creada es: ");
		System.out.println(cita2.toString());
	}

}
