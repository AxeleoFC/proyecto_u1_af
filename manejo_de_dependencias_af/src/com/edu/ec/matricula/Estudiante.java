package com.edu.ec.matricula;
import java.time.LocalDateTime;
public class Estudiante {
	private String nombre;
	private String apellido;
	private LocalDateTime fechaNacimento;
	
	@Override
	public String toString() {
		return "Estudiante [Nombre=" + nombre + ", Apellido=" + apellido + ", Fecha de nacimento=" + fechaNacimento + "]";
	}
	
	//GET y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaNacimento() {
		return fechaNacimento;
	}
	public void setFechaNacimento(LocalDateTime fechaNacimento) {
		this.fechaNacimento = fechaNacimento;
	}
}