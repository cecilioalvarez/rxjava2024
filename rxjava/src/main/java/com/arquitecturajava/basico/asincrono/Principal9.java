package com.arquitecturajava.basico.asincrono;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import com.arquitecturajava.basico.operadores.Persona;

import io.reactivex.rxjava3.core.Observable;

public class Principal9 {

	public static void main(String[] args) {
		
		Observable<Persona> o1=Observable.just(new Persona("pepe","perez",20)).delay(7, TimeUnit.SECONDS);
		Observable<Persona> o2=Observable.just(new Persona("maria","perez",30)).delay(3, TimeUnit.SECONDS);
		
		Observable<Persona> o3=	Observable.just(new Persona("david","perez",50)).delay(2, TimeUnit.SECONDS);

		
		System.out.println(LocalTime.now());
		
		Observable.concat(o1, o2,o3)
        .subscribe(i -> System.out.println("RECEIVED: " + i));

		
	
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
