package com.arquitecturajava.basico.asincrono;

public class Persona {

	private String nombre;
	
	private InfoMedica infoMedica;
	private InfoGastos infoGastos;
	
	

	public Persona(InfoMedica infoMedica, InfoGastos infoGastos) {
		super();
		this.infoMedica = infoMedica;
		this.infoGastos = infoGastos;
	}

	public InfoMedica getInfoMedica() {
		return infoMedica;
	}

	public void setInfoMedica(InfoMedica infoMedica) {
		this.infoMedica = infoMedica;
	}

	public InfoGastos getInfoGastos() {
		return infoGastos;
	}

	public void setInfoGastos(InfoGastos infoGastos) {
		this.infoGastos = infoGastos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, InfoMedica infoMedica, InfoGastos infoGastos) {
		super();
		this.nombre = nombre;
		this.infoMedica = infoMedica;
		this.infoGastos = infoGastos;
	}
	
	
	
	
}
