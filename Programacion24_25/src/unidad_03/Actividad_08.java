package unidad_03;

import java.util.Scanner;

public class Actividad_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Introducir por teclado dos números, A y B (A mayor que B). Visualiza los números desde A a
		B, indicando cuántos hay que sean pares.
		*/
		
		int A;
		int B; 
		int i; 
		int pares = 0; 
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		B = lector.nextInt();
		System.out.println("Ahora introduce un número mayor:");
		A = lector.nextInt();
		
		for (i = A; i >= B; i--) {
			System.out.println(i);
			
			if (i%2 == 0) {
				pares++;
			}
		}
		System.out.println("Hay " + pares + " números pares.");

	}

}
