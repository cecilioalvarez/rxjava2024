package com.arquitecturajava.basico.asincrono;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal21 {
	public static void main(String[] args) {

		Observable.interval(300, TimeUnit.MILLISECONDS)
        .map(i -> (i + 1) * 300)
        .window(1, TimeUnit.SECONDS)
        .flatMapSingle(obs -> obs.reduce("", (total, next) -> 
                total + (total.equals("") ? "" : "|") + next))
        .subscribe(System.out::println);
 try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}