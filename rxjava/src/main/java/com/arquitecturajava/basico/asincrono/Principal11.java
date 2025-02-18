package com.arquitecturajava.basico.asincrono;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Principal11 {


	    public static void main(String[] args) {
	        //emit every second
	        Observable<String> src1 =
	              Observable.interval(1, TimeUnit.SECONDS)
	                        .take(2)
	                        .map(l -> l + 1) // emit elapsed seconds
	                        .map(l -> "Source1: " + l + " seconds");
	        //emit every 300 milliseconds
	        Observable<String> src2 =
	              Observable.interval(300, TimeUnit.MILLISECONDS)
	                     .map(l -> (l + 1) * 300) // emit elapsed millis
	                     .map(l -> "Source2: " + l + " milliseconds");
	        //emit Observable that emits first
	        Observable.amb(Arrays.asList(src1, src2)).
	                 subscribe(i -> System.out.println("RECEIVED: " + i));
	        //keep application alive for 5 seconds
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

