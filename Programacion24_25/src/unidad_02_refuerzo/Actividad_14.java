package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num1 = lector.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = lector.nextInt();
		
		if (num1 > num2) System.out.println(num1 + " es mayor que " + num2 + ", por lo que num1 es mayor que num2.");
		else if (num1 == num2) System.out.println("Los dos números son iguales.");
		else System.out.println(num2 + " es mayor que " + num1 + ", por lo que num2 es mayor que num1.");
		
		lector.close();

	}

}
