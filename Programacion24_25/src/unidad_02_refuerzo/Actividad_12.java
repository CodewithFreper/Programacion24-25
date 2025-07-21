package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo.
		
		int num;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num = lector.nextInt();
		
		if (num >= 0) System.out.println("El número es positivo.");
		else System.out.println("El número es negativo.");
		
		lector.close();

	}

}
