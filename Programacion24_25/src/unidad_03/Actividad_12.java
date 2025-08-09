package unidad_03;

import java.util.Scanner;

public class Actividad_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que solicite un número entero e indique si se trata de un número primo
		 * o no.
		 */

		int num;
		int i;
		boolean esPrimo = true;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("Por favor, introduce un número entero:");
			num = lector.nextInt();
		} while (num < 0);
		
		if (num == 0 || num == 1) {
			System.out.println(num + " no es un número primo");
		} else if (num > 0) {
			for (i = 2; i < num; i++) {
				if (num%i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}

}
