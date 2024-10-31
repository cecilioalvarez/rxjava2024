package com.arquitecturajava.basico.asincrono;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal19 {
	public static void main(String[] args) {

		Observable<Long> cutOffs = Observable.interval(1, TimeUnit.SECONDS);
		Observable.interval(300, TimeUnit.MILLISECONDS).map(i -> (i + 1) * 300)
				.buffer(cutOffs)
				.doOnNext((e)->System.out.println(LocalTime.now()))
				.subscribe(System.out::println);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}