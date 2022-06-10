package com.edu.ec.matricula;

import java.time.LocalDateTime;

public class Matricula {
	private Estudiante estudiante;
	private Materia materia;
	private LocalDateTime fechaMatricula;
	
	public void matricular(String nombreEstu, String apellidoEstu,LocalDateTime fechaNaci, 
			String nombreMate, Integer numHoras, LocalDateTime fechaMatricula) {
		this.fechaMatricula=fechaMatricula;
		
		this.estudiante=new Estudiante();
		this.estudiante.setNombre(nombreEstu);
		this.estudiante.setApellido(apellidoEstu);
		this.estudiante.setFechaNacimento(fechaNaci);
		
		this.materia=new Materia();
		this.materia.setNombreMateria(nombreMate);
		this.materia.setNumHoras(numHoras);
		
		//Aqui se sube a la base de datos
	}
	
	@Override
	public String toString() {
		return "Matricula "+ "\n" +"[Estudiante=" + estudiante + "\n" +"Materia=" + materia + "\n" +"Fecha de matricula=" + fechaMatricula
				+ "]";
	}

	//GET y SET
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}	
}