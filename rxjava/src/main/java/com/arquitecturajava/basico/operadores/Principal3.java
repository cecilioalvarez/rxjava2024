package com.arquitecturajava.basico.operadores;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class Principal3 {

	public static void main(String[] args) {
		
		
		List<Persona> lista= new ArrayList<Persona>();
		lista.add(new Persona("juan","gomez",20));
		lista.add(new Persona("david","sanchez",30));
		lista.add(new Persona("maria","perez",40));
		

		Observable<Persona> observable=Observable.fromIterable(lista);
		
		Observable<Integer> edades=observable.map(Persona::getEdad);
		
		edades.reduce(new Integer(0),(total,elemento)->(total+elemento)).subscribe(System.out::println);
		
		
	}

}
