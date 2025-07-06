package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que dado el precio de un artículo y el precio de venta
		 * real nos muestre el porcentaje de descuento realizado.
		 */
		
		double precio;
		double real;
		double porcentaje;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el precio del artículo:");
		precio = lector.nextDouble();
		
		System.out.println("Introduce el precio real de venta:");
		real = lector.nextDouble();
		
		porcentaje = ((precio - real) * 100) / precio;
		
		System.out.println("El porcentaje del descuento es: " + porcentaje + "%.");
		
		lector.close();
		

	}

}
