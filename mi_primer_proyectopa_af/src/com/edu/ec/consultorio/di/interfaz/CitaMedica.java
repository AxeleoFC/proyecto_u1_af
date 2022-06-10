package com.edu.ec.consultorio.di.interfaz;

import java.time.LocalDateTime;

import com.edu.ec.consultorio.Doctor;
import com.edu.ec.consultorio.Paciente;
import com.edu.ec.consultorio.PacientePediatria;
import com.edu.ec.consultorio.PacienteTerceraEdad;

public class CitaMedica {
	
	//LocalDateTime para manejos de fecha
	private LocalDateTime fechaAgenda;
	private LocalDateTime fechaAtencion;
	private Doctor doctor;
	private IPaciente paciente;
	
	public void agendar(LocalDateTime fechaAgenda, LocalDateTime fechaAtencion, String nombreDoctor, 
			String apellidoDoctor, IPaciente paciente) {
		this.fechaAgenda=fechaAgenda;
		this.fechaAtencion=fechaAtencion;
		
		this.doctor=new Doctor();
		this.doctor.setNombre(nombreDoctor);
		this.doctor.setApellido(apellidoDoctor);
		
		this.paciente=paciente;
		//Aqui insertamos en la base de datos de la cita
		System.out.println("Insertando en la base de datos");
	}
	
	
	@Override
	public String toString() {
		return "CitaMedica [fechaAgenda=" + fechaAgenda + ", fechaAtencion=" + fechaAtencion + ", doctor=" + doctor
				+ ", paciente=" + paciente + "]";
	}
	
	//SET y GET

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}
	public LocalDateTime getFechaAtencion() {
		return fechaAtencion;
	}
	public void setFechaAtencion(LocalDateTime fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public IPaciente getPaciente() {
		return paciente;
	}
	public void setPaciente(IPaciente paciente) {
		this.paciente = paciente;
	}
}