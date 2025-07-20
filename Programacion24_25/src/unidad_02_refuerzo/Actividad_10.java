package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que lee dos números, calcula y muestra el valor de
		 * su suma, resta, producto y división. (Ten en cuenta la división por cero )
		 */
		
		double a;
		double b; 
		double suma, resta, producto, division;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un valor: ");
		a = lector.nextDouble();
		
		System.out.println("Por favor, introduce otro valor: ");
		b = lector.nextDouble();
		
		suma = a + b;
		resta = a - b;
		producto = a * b; 
		
		System.out.println("Los resultados son: \nSuma: " + suma + "\nResta: " + resta + "\nProducto: " + producto);
		
		if (b != 0) {
		division = a / b;
		System.out.println("División: " + division);
		} else {
			System.out.println("No se puede dividir entre 0.");
		}
		
		lector.close();
		
	}

}
