package unidad_02;

import java.util.Scanner;

public class Actividad_04_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementa un programa que muestra cuánto valdrán unas deportivas con un precio de
		* 85.00 euros, si están rebajadas un 15%. 
		* Utilizando clase Scanner. */
		
		Scanner lector = new Scanner(System.in);
		double porcentaje;
		double porcentaje_decimal;
		double precio_antes;
		double precio_final;
	
		System.out.println("Cual es el precio sin descuento?");
		precio_antes = lector.nextDouble();
		
		System.out.println("Cual es el descuento?");
		porcentaje = lector.nextDouble();
		
		porcentaje_decimal = porcentaje / 100;
		precio_final = precio_antes - precio_antes*porcentaje_decimal;
		
		System.out.println("El precio final es: " + precio_final + "€.");
		
		lector.close();

	}

}
