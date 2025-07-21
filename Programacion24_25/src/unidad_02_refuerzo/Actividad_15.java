package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
		
		int num1; 
		int num2;
		int num3;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Num1:");
		num1 = lector.nextInt();
		System.out.println("Num2:");
		num2 = lector.nextInt();
		System.out.println("Num3:");
		num3 = lector.nextInt();
		
		if (num1 > num2 && num1 > num3) System.out.println("Num1 es el mayor.");
		else if (num2 > num1 && num2 > num3) System.out.println("Num2 es el mayor");
		// else System.out.println("Num3 es el mayor."); Así, si todos fueran iguales diría que Num3 es el mayor
		else if (num3 > num1 && num3 > num2) System.out.println("Num3 es el mayor.");
		else System.out.println("Son los 3 iguales.");
		
		lector.close();
		
		

	}

}
