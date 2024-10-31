package com.arquitecturajava.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class MiObserver implements Observer<String>{

	private String nombre;
	
	@Override
	public void onSubscribe(@NonNull Disposable d) {
		// TODO Auto-generated method stub
		
	}
	
	

	public MiObserver() {
		super();
	}



	public MiObserver(String nombre) {
		super();
		this.nombre = nombre;
	}



	@Override
	public void onNext(@NonNull String t) {
		System.out.println("elemento" + nombre+t);
		
	}

	@Override
	public void onError(@NonNull Throwable e) {
		System.out.println(e.getMessage());
		
	}

	@Override
	public void onComplete() {
		System.out.println("finaliza"+ nombre);
		
	}

}
