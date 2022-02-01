package com.psp.ejercicio3;

import java.util.Date;

public class EncuentraPrimos {

	public static void main(String[] args) {

		long t0 = (new Date()).getTime();
		Primos p1 = new Primos (1,2000000, "Hilo1");
		Primos p2 = new Primos (2000001,4000000, "Hilo2");
		Primos p3 = new Primos (4000001,6000000, "Hilo3");
		Primos p4 = new Primos (6000001,8000000, "Hilo4");
		Primos p = new Primos(1, 8000000, "");
		
		p1.calcular();
		p2.calcular();
		p3.calcular();
		p4.calcular();
		
	
		int n1 = p1.cuantos();
		int n2 = p2.cuantos();
		int n3 = p3.cuantos();
		int n4 = p4.cuantos();
		
		
		int n = p1.cuantos()+p2.cuantos()+p3.cuantos()+p4.cuantos();
		
		long t1 = (new Date()).getTime();
		long time = t1 - t0;
		
		System.out.println("Número de primos entre los números 1 y 2000000 son: " + p1.cuantos() + " calculados por: "+p1.getNombre());
		System.out.println("Número de primos entre los números 2000001 y 4000000 son: " + p2.cuantos() + " calculados por: "+p2.getNombre());		
		System.out.println("Número de primos entre los números 4000001 y 6000000 son: " + p3.cuantos() + " calculados por: "+p3.getNombre());
		System.out.println("Número de primos entre los números 6000001 y 8000000 son: " + p4.cuantos() + " calculados por: "+p4.getNombre());
		System.out.println("------------------------");
		System.out.println("Número de primos menores que 8000000: " + n + " calculado en " + time + " milisegundos concurrentemente");

	}

}
