package com.arquitecturajava.basico;

import java.util.concurrent.TimeUnit;

import com.arquitecturajava.observers.MiObserver;

import io.reactivex.rxjava3.core.Observable;

public class Principal9 {

	public static void main(String[] args) {
		
		
		
   
		  Observable<String> source = Observable.interval(1, TimeUnit.SECONDS).map(i->i+"");
		  
		  source.subscribe(new MiObserver("A"));
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}

		  source.subscribe(new MiObserver("B"));

		  try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}
	}

}
