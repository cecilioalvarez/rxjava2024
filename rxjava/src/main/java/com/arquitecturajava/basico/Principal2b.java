package com.arquitecturajava.basico;

import io.reactivex.rxjava3.core.Observable;

public class Principal2b {

	public static void main(String[] args) {
		
		 String cadena=null;
		  Observable<String> textos = 
                  Observable.just("Hola", "Que", "Tal","estas");
		  
		  textos.subscribe(
				    item -> System.out.println("Item: " + item),
				    error -> System.out.println("Error: " + error.getMessage())
				);
	}

}
