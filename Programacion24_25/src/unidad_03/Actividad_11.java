package unidad_03;

import java.util.Scanner;

public class Actividad_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que calcule la potencia de un número real (a) elevado a un número
		 * entero (b). Se debe de tener en cuenta que tanto a como b pueden valer 0 o pueden ser
		 * números negativos. Se debe de implementar la funcionalidad, no utilizar ningún método de
		 * Java.
		 */
		
		double a;
		int b;
		int i;
		double resultado = 1;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la base de la potencia:");
		a = lector.nextDouble();
		
		System.out.println("Introduce el exponente:");
		b = lector.nextInt();
		
		if (a == 0 && b == 0){
			System.out.println("0 elevado a 0 es una indeterminación matemática");
			return;
		}
		if (b == 0) {
			resultado = 1;
		} else if (b > 0) {
			for (i = b; i > 0; i--) {
				resultado  *= a;
			}
		} else if ( b < 0){
			for (i = b; i < 0; i++) {
				resultado  *= a;
			}
			resultado = 1 / resultado;
		}

		System.out.println("El resultado es: " + resultado);

	}

}   
