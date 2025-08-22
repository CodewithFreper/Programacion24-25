package unidad_04;

import java.util.Scanner;

public class Actividad_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un método que acepte un número entero y calcule su factorial (n!).
		
		/*El factorial de un número (n!) es el producto de todos 
		 * los números enteros positivos menores o iguales a ese número. 
		 * Ej: 5! = 5 * 4 * 3 * 2 * 1
		 */
		int num;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("Por favor, introduce un número entero: ");
			num = lector.nextInt();
		} while (num < 0);
		
		System.out.println("El factorial de " + num + " se descompone de la siguiente manera: \n" + factorial(num) + resultadoFactorial(num));
		
		lector.close();
	}
	
	public static String factorial(int num) {
		String resultado = num + "! = ";
		int i;
		for(i = num; i >= 1; i-- ) {
			resultado += i + " * ";
			if (i == 1) {resultado += 1 + " = ";}
		}
		
		return resultado;
	}
	
	public static int resultadoFactorial(int num) {
		int resultado = 1;
		int i; 
		for(i = num; i > 1; i-- ) {
			resultado *= i;
		}
		return resultado;
	}

}

//FUNCIONA

