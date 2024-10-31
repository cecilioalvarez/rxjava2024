package com.arquitecturajava.basico;

import io.reactivex.rxjava3.core.Observable;

public class Principal2 {

	public static void main(String[] args) {
		
		  Observable<String> textos = 
                  Observable.just("Hola", "Que", "Tal","estas");
		  
		  textos.subscribe(System.out::println);

	}

}
