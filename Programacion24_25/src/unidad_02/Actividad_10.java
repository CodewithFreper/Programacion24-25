package unidad_02;

import java.util.Scanner;

public class Actividad_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Una temperatura expresada en grados Celsius (lo que conocemos como grados
		 * centígrados) puede ser convertida a una temperatura equivalente F (grados Fahrenheit)
		 * aplicando la siguiente fórmula:
		 * f=(9/5)c+32
		 * donde f representa los grados Fahrenheit y c los grados Celsius.
		 * Escribe un programa que solicite al usuario el número de grados Celsius e indique el
		 * equivalente en Fahrenheit.
		 */
		
		int input;
		int celsius;
		int fahrenheit;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados Celsius que quieres pasar a Fahrenheit:");
		input = lector.nextInt();
		celsius = input;
		fahrenheit = (9/5) * celsius + 32;
		
		System.out.println(celsius + "ºC equivalen a " + fahrenheit + "ºF.");
		
		lector.close();
		
		

	}

}
