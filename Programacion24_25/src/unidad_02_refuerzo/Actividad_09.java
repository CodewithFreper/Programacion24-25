package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que pide la edad por teclado y nos muestra el mensaje
		 * de “eres mayor de edad” o el mensaje de “eres menor de edad”.
		 */
		
		int edad;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		edad = lector.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}
		
		lector.close();

	}

}
