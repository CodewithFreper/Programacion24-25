package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que lee 2 números y muestra el mayor.
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		num1 = lector.nextInt();
		System.out.println("Introduce otro número:");
		num2 = lector.nextInt();
		
		if (num1 > num2) System.out.println("El número mayor es num1: " +  num1);
		else System.out.println("El número mayor es num2: " + num2);
		
		lector.close();

	}

}
