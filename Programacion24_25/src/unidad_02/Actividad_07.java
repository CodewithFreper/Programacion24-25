package unidad_02;

import java.util.Scanner;

public class Actividad_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un programa que pida al usuario los valores de los lados de un rectángulo (ancho
		y alto). A partir de estos datos, deberá calcular y escribir en pantalla las longitudes, el
		perímetro y el área del rectángulo.*/
		
		Scanner lector = new Scanner(System.in);
		int ancho;
		int alto;
		int perimetro;
		int area;
		
		System.out.println("Por favor, introduce el ancho del rectángulo:");
		ancho = lector.nextInt();
		
		System.out.println("Por favor, introduce el alto del rectángulo:");
		alto = lector.nextInt();
		
		perimetro = 2 * (ancho + alto);
		area = ancho * alto;
		
		System.out.println("El ancho del rectángulo es: " + ancho + "cms.\n"
				+ "El alto del rectángulo es: " + alto + "cms.\n"
				+ "El perímetro del rectángulo es: " + perimetro + "cms.\n"
				+ "El área del rectángulo es: " + area + "cms2.");
		
		lector.close();

	}

}
