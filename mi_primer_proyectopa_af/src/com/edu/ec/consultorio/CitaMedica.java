package com.edu.ec.consultorio;

import java.time.LocalDateTime;

public class CitaMedica {
	
	//LocalDateTime para manejos de fecha
	private LocalDateTime fechaAgenda;
	private LocalDateTime fechaAtencion;
	private Doctor doctor;
	private Paciente paciente;
	
	public void agendar(LocalDateTime fechaAgenda, LocalDateTime fechaAtencion, String nombreDoctor, 
			String apellidoDoctor, String nombrePaciente, Integer edadPaciente, String tipoPaciente) {
		this.fechaAgenda=fechaAgenda;
		this.fechaAtencion=fechaAtencion;
		
		this.doctor=new Doctor();
		this.doctor.setNombre(nombreDoctor);
		this.doctor.setApellido(apellidoDoctor);
		
		if(tipoPaciente.equals("PTE")) {
			this.paciente=new PacienteTerceraEdad();
		}else {
			this.paciente=new PacientePediatria();
		}
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaciente);
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
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}