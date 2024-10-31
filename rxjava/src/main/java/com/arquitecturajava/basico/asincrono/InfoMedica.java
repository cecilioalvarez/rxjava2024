package com.arquitecturajava.basico.asincrono;

public class InfoMedica {

	@Override
	public String toString() {
		return "InfoMedica [enfermedad1=" + enfermedad1 + ", enfermedad2=" + enfermedad2 + "]";
	}
	private String enfermedad1;
	private String enfermedad2;
	public String getEnfermedad1() {
		return enfermedad1;
	}
	public void setEnfermedad1(String enfermedad1) {
		this.enfermedad1 = enfermedad1;
	}
	public String getEnfermedad2() {
		return enfermedad2;
	}
	public void setEnfermedad2(String enfermedad2) {
		this.enfermedad2 = enfermedad2;
	}
	public InfoMedica(String enfermedad1, String enfermedad2) {
		super();
		this.enfermedad1 = enfermedad1;
		this.enfermedad2 = enfermedad2;
	}
	
	
}
