package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que pide la edad por teclado y nos muestra el mensaje
		 * de “Eres mayor de edad” solo si lo somos.
		 */
		
		int edad;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		edad = lector.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}
		
		lector.close();
	}

}
