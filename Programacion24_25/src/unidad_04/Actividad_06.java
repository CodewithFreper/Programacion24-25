package unidad_04;

import java.util.Scanner;

public class Actividad_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * La media armónica de dos números es el resultado obtenido al calcular los inversos de
		 * los números, calcular la media y calcular el inverso del resultado. el inverso de un
		 * número es 1/número. Escribe un método que acepta dos argumentos de tipo double y
		 * devuelve la media armónica de los números.
		 */
		
		double a;
		double b;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el valor de A:");
		a = lector.nextDouble();
		System.out.println("Introduce el valor de B:");
		b = lector.nextDouble();
		
		System.out.println(mediaArmonica(a, b));
		
		lector.close();

	}
	
	public static double mediaArmonica(double a, double b) {
		double resultado; 
		
		resultado = 1/((1/a + 1/b) / 2);
		
		return resultado; 
	}

}
