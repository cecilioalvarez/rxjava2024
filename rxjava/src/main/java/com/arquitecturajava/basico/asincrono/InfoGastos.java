package com.arquitecturajava.basico.asincrono;

import java.util.ArrayList;
import java.util.List;

public class InfoGastos {

	private List<Double> gastos= new ArrayList<Double>();

	public List<Double> getGastos() {
		return gastos;
	}

	public void setGastos(List<Double> gastos) {
		this.gastos = gastos;
	}
	
	
	public void addGasto(double gasto) {
		
		gastos.add(gasto);
	}

	public InfoGastos(List<Double> gastos) {
		super();
		this.gastos = gastos;
	}
	
	
	
}
