package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5
		
		int lado;
		int area;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de los lados del cuadrado: ");
		lado = lector.nextInt();
		
		area = (int) Math.pow(lado, 2);
		
		System.out.println("El área de un cuadrado de lado igual a " + lado + " es: " +  area);
		
		lector.close();

	}

}
