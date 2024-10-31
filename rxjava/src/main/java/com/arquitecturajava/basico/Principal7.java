package com.arquitecturajava.basico;

import com.arquitecturajava.observers.MiObserver;

import io.reactivex.rxjava3.core.Observable;

public class Principal7 {

	public static void main(String[] args) {
		
		
		
   
		  Observable<String> source = Observable.create(emitter -> {
	            emitter.onNext("hola");
	            emitter.onNext("que");
	            emitter.onNext("tal");
	            emitter.onError( new Exception("algo fallo"));
	            emitter.onComplete();
	    });
		source.subscribe(new MiObserver());
		source.subscribe(new MiObserver());
		source.subscribe(new MiObserver());


	}

}
