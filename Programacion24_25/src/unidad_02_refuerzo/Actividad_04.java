package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Escribe un programa que lea dos números, calcule y muestre el valor de sus
		 * suma, resta, producto y división.
		 */
		
		int a;
		int b;
		int suma;
		int resta; 
		int producto;
		int division;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce dos números: ");
		a = lector.nextInt();
		b = lector.nextInt();
		
		suma = a + b;
		resta = a - b;
		producto = a * b;
		division = a / b;
		
		System.out.println("Suma: " + suma + "\nResta: " + resta + "\nProducto: " + producto + "\nDivisión: " + division);
		
		lector.close();
		
		

	}

}
