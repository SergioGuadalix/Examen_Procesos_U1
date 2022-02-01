package com.psp.ejercicio2;

public class Huida {

	public static void main(String[] args) {
		for (int i=1; i<=20;i++) {
			String nombre = String.valueOf(i);
			Cachorro cachorro= new Cachorro(nombre);
			cachorro.start();
		}

	}

}
