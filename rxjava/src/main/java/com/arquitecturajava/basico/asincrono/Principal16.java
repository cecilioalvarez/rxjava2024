package com.arquitecturajava.basico.asincrono;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class Principal16 {

	public static void main(String[] args) {

		ConnectableObservable<Integer> ints = Observable.range(1, 3).publish();
		ints.subscribe(i -> System.out.println("Observer One: "+ Thread.currentThread().getName() + i));
		
		ints.subscribe(i -> System.out.println("Observer Two: "+ Thread.currentThread().getName() + i));
		ints.connect();

	}
}
