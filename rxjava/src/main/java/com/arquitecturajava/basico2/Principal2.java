package com.arquitecturajava.basico2;

import io.reactivex.rxjava3.core.Observable;

public class Principal2 {

	public static void main(String[] args) {
		
		  Observable<Integer> numeros = Observable.range(1, 100);
                  
		  
		  numeros
		  .doOnEach(System.out::println)
		  .skip(10)
		  .subscribe(s -> System.out.println("item:" +s.toString()));

	}

}
