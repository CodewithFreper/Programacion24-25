package unidad_03;

import java.util.Scanner;

public class Actividad_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que pida una calificación (entre cero y diez) y visualice su 
		 * equivalente alfabético, según la siguiente tabla:
		 * • Desde 0 y menor que 3 -------> MUY DEFICIENTE
		 * • Desde 3 y menor que 5 -------> INSUFICIENTE
		 * • Desde 5 y menor que 6 -------> SUFICIENTE
		 * • Desde 6 y menor que 7 -------> BIEN
		 * • Desde 7 y menor que 9 -------> NOTABLE
		 * • Desde 9 hasta 10 -------> EXCELENTE
		 */
		
		double nota;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce la nota numérica:");	
		nota = lector.nextDouble();

		while (nota < 0 || nota > 10 ) {
			System.out.println("Por favor, introduce un valor entre 0 y 10: ");
			nota = lector.nextDouble();
		};
		
		if (nota < 3) System.out.println("MUY DEFICIENTE");
		else if (nota < 5) System.out.println("INSUFICIENTE");
		else if (nota < 6) System.out.println("SUFICIENTE");
		else if (nota < 7) System.out.println("BIEN");
		else if (nota < 9) System.out.println("NOTABLE");
		else System.out.println("EXCELENTE");
	}	

}
