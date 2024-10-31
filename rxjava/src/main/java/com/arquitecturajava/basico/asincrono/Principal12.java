package com.arquitecturajava.basico.asincrono;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal12 {

	public static void main(String[] args) {

		List<String> lista = List.of("juan", "maria", "gema");

		Observable.interval(2, TimeUnit.SECONDS)
		.take(3)
		.map(i->lista.get(i.intValue()))
		.map(Principal12::getDatosMedicos)
		.subscribe(System.out::println);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static InfoMedica getDatosMedicos(String nombre) {

		if (nombre.equals("juan")) {

			return new InfoMedica("rotura brazo", "apendicitis");
		} else if (nombre.equals("maria")) {

			return new InfoMedica("rotura fibrilar", "dolor de espalda");
		} else {

			return new InfoMedica("", "");
		}
	}

	public static List<Double> getGastos(String nombre) {

		if (nombre.equals("juan")) {

			return List.of(200.0, 300.0);
		} else if (nombre.equals("maria")) {

			return List.of(100.0, 500.0);
		} else {

			return List.of(300.0, 200.0);
		}
	}
}
