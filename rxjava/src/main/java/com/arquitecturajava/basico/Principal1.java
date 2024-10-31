package com.arquitecturajava.basico;

import io.reactivex.rxjava3.core.Observable;

public class Principal1 {

	public static void main(String[] args) {
		
		  Observable<String> textos = 
                  Observable.just("Hola", "Que", "Tal","estas");
		  
		  textos.subscribe(s -> System.out.println(s));

	}

}
