package com.arquitecturajava.basico.asincrono;

import java.util.concurrent.TimeUnit;

import com.arquitecturajava.basico.operadores.Persona;

import io.reactivex.rxjava3.core.Observable;

public class Principal4 {

	public static void main(String[] args) {
		
		Observable<Persona> o1=Observable.just(new Persona("pepe","perez",20)).delay(7, TimeUnit.SECONDS);
		Observable<Persona> o2=Observable.just(new Persona("maria","perez",30)).delay(3, TimeUnit.SECONDS);
		
		Observable<Persona> o3=	Observable.just(new Persona("david","perez",50)).delay(2, TimeUnit.SECONDS);

		
		o1.subscribe(System.out::println);
		o2.subscribe(System.out::println);
		o3.subscribe(System.out::println);
		
	
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
