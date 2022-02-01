package com.psp.ejercicio2;

import java.util.Random;

public class Cachorro extends Thread {
	public Cachorro(String str) {
		super(str);
	}

	public void run() {

		System.out.println("El cachorro " + getName() + " corre");
		try {
			sleep((long)(Math.random()*1000));
		}catch (InterruptedException e) {}

		
		Random r= new Random();
		boolean b = r.nextBoolean();
		
		
		if (b == true) {
			try {
				sleep((long)(Math.random()*1000));
			}catch (InterruptedException e) {}

			System.out.println("El cachorro " + getName() + " consigue escapar!");
			
		} else {
			try {
				sleep((long)(Math.random()*1000));
			}catch (InterruptedException e) {}

			System.out.println("Cruela de Vil atrapa a cachorro " + getName());

		}
	}

}
