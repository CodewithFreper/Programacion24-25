package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que lea una calificación numérica entre 0 y 10 y la
		 * transforma en calificación alfabética, escribiendo el resultado.
		 * de 0 a <3 Muy Deficiente.
		 * de 3 a <5 Insuficiente.
		 * de 5 a <6 Bien.
		 * de 6 a <9 Notable
		 * de 9 a 10 Sobresaliente
		 * 
		 */
		
		int nota;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Nota: ");
		nota = lector.nextInt();
		
		switch (nota) {
		case 0: 
		case 1:
		case 2:
			System.out.println("Muy deficiente.");
			break;
/*		case 1:
			System.out.println("Muy deficiente.");
			break;
		case 2: 
			System.out.println("Muy deficiente.");
			break;
*/			
		case 3: 
		case 4:
			System.out.println("Insuficiente.");
			break;
			
		case 5:
			System.out.println("Bien.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("Notable.");
			break;
			
		case 9:
		case 10: 
			System.out.println("Sobresaliente.");
			break;
			
		}
		
		

	}

}
