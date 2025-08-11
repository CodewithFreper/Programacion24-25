package unidad_03;

import java.util.Scanner;

public class Actividad_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que solicite al usuario un número entero positivo. El programa debe de
		 * presentar en pantalla la descomposición en factores primos del número.
		 * 
		 * Ejemplo: si el número es 36, deberá de escribir 36=2 * 2 * 3 * 3
		 */
		
		int num;
		int i;
		boolean esPrimo = true;
		int numUsuario;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("Por favor, introduce un número enero:");
			num = lector.nextInt();
		} while (num < 0);
		
		
		if (num == 0 || num == 1) {
			System.out.println(num + " no tiene descomposición en factores primos.");
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
			numUsuario = num; 
			System.out.print(num + " = ");
			for (i = 2; i<=num; i++) {
				while (num % i == 0) {
					System.out.print(i);
					num = num/i;
					if (num > 1) {
						System.out.print(" * ");
					}
				}
			}
		}

	}

}

//FUNCIONA
