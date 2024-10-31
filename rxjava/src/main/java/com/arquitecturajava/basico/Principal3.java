package com.arquitecturajava.basico;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal3 {

	public static void main(String[] args) {
		
		
		   Observable<Long> secondIntervals =
                   Observable.interval(1, TimeUnit.SECONDS);
      secondIntervals.subscribe(s -> System.out.println(s));
      
      try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
