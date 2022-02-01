package com.psp.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Sergio Guadalix Romero
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) throws IOException {
		//ProcessBuilder proceso = new ProcessBuilder("cmd", "/C", "tree");
		Process proceso = Runtime.getRuntime().exec("cmd /C tree ");
		System.getProperty("user.home");
		try {
			//Process consulta = proceso.start();
			BufferedReader lector = new BufferedReader
					(new InputStreamReader(proceso.getInputStream()));
			String linea;
			
			while((linea=lector.readLine()) !=null) {
				System.out.println(linea);
			}
			lector.close();
		}catch (IOException e) {
			System.out.println("Error de entrada o salida de información: ");
			e.printStackTrace();
		}
	}
	

}
