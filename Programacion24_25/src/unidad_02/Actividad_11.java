package unidad_02;

import java.util.Scanner;

public class Actividad_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Queremos resolver expresiones del tipo ax+b=c, es decir, ecuaciones de primer grado,
		 * donde x es la incógnita, a y b son los coeficientes y c es el resultado.
		 * Implementa un programa donde se pida al usuario los valores de los coeficientes y el
		 * resultado, y que nos devuelve el valor de x. El coeficiente a no puede ser 0 (no debes de
		 * controlar nada de la lógica del programa, solo introducir los datos).
		 * 
		 * Aquí tienes un ejemplo de ejecución:
		 * Coeficiente a: 2
		 * Coeficiente b: 3
		 * Resultado de la ecuación: 8
		 * En la ecuación 2.0x + 3.0 = 8.0, x = 2.5
		 */
		
		int a;
		int b; 
		int c;
		int x;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce el valor de a:");
		a = lector.nextInt();
		
		System.out.println("Por favor, introduce el valor de b:");
		b = lector.nextInt();
		
		System.out.println("Por favor, introduce el valor de c:");
		c = lector.nextInt();
		
		x = (c-b) / a;
		System.out.println("El valor de x es: " + x);
		
		lector.close();
		
		
	}

}
