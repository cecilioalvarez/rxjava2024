package com.arquitecturajava.basico2;

import io.reactivex.rxjava3.core.Observable;

public class Principal3 {

	public static void main(String[] args) {
		
		 

		        Observable.just(1,2,3,4,4,3,3,2,1)
		         
		          .distinct()
		          .subscribe(i -> System.out.println("RECEIVED: " + i));
		    
		        System.out.println("********");

		        Observable.just(1,2,2,3,5,3,2,2,1)
		         
		          .distinctUntilChanged()
		          .subscribe(i -> System.out.println("RECEIVED: " + i));
		      }
	
	
	
	
	
	

}
