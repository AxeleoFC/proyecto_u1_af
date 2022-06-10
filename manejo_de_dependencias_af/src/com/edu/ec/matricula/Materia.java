package com.edu.ec.matricula;

public class Materia {
	private String nombreMateria;
	private Integer numHoras;
	
	@Override
	public String toString() {
		return "Materia [Materia=" + nombreMateria + ", Horas=" + numHoras + "]";
	}
	
	//GET y SET
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public Integer getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(Integer numHoras) {
		this.numHoras = numHoras;
	}
}