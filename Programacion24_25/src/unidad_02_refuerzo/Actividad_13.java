package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que lee dos números y los visualiza en orden ascendente.
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num1 = lector.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = lector.nextInt();
		
		if (num1 > num2) System.out.println(num2 + ", " + num1);
		else System.out.println(num1 + ", " + num2);
		
		lector.close();
		
	}

}
