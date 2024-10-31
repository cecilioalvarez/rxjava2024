package com.arquitecturajava.basico.asincrono;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal18 {
	public static void main(String[] args) {

		Observable.interval(300, TimeUnit.MILLISECONDS).map(i -> (i + 1) * 300).buffer(1, TimeUnit.SECONDS)
				.subscribe(System.out::println);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}