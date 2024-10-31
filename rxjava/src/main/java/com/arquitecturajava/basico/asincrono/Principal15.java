package com.arquitecturajava.basico.asincrono;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal15 {

	public static void main(String[] args) {

		Observable<Integer> ints = Observable.range(1, 3);
        ints.subscribe(i -> System.out.println("Observer : "+ Thread.currentThread().getName()+  "" + i));
        ints.subscribe(i -> System.out.println("Observer Two: " +Thread.currentThread().getName()+ " " + i));


	}
}
