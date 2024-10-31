package com.arquitecturajava.basico.asincrono;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal23 {
	public static void main(String[] args) {

		
		Observable<String> source1 =
	             Observable.interval(100, TimeUnit.MILLISECONDS)
	                       .map(i -> (i + 1) * 100) //map to elapsed time
	                       .map(i -> "SOURCE 1: " + i)
	                       .take(10);

	        Observable<String> source2 =
	             Observable.interval(300, TimeUnit.MILLISECONDS)
	                       .map(i -> (i + 1) * 300) //map to elapsed time
	                       .map(i -> "SOURCE 2: " + i)
	                       .take(3);

	        Observable<String> source3 =
	            Observable.interval(2000, TimeUnit.MILLISECONDS)
	                      .map(i -> (i + 1) * 2000) //map to elapsed time
	                      .map(i -> "SOURCE 3: " + i)
	                      .take(2);
	        Observable.concat(source1, source2, source3).throttleFirst(2, TimeUnit.SECONDS)
	                  .subscribe(System.out::println);
	        try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}