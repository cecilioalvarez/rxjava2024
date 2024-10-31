package com.arquitecturajava.basico;

import io.reactivex.rxjava3.core.Observable;

public class Principal4 {

	public static void main(String[] args) {
		
		
		
   
		  Observable<String> source = Observable.create(emitter -> {
	            emitter.onNext("hola");
	            emitter.onNext("que");
	            emitter.onNext("tal");
	            emitter.onNext("estas");
	            emitter.onComplete();
	    });
		source
		.filter((s)->s.length()>3)
		.map(s->s.toUpperCase()).subscribe(System.out::println);


	}

}
