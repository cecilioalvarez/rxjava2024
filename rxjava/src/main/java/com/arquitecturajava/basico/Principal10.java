package com.arquitecturajava.basico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import com.arquitecturajava.observers.MiObserver;

import io.reactivex.rxjava3.core.Observable;

public class Principal10 {

	public static void main(String[] args) {
		
		
		
   
		  Observable<String> source = Observable.interval(1, TimeUnit.SECONDS).map(i->i+ ":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond());
		  
		  source.subscribe((d)->System.out.println("primero"+d));
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		  System.out.println("**********************");
		  source.subscribe((d)->System.out.println("segundo"+d));

		  try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}
	}

}
