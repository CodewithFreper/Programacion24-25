package unidad_04;

import java.util.Scanner;

public class Actividad_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Diseña un método que devuelva el mayor de cuatro números pasados como
		 *parámetros.
		*/
		
		int a, b, c, d;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce el valor de A:");
		a = lector.nextInt();
		System.out.println("Por favor, introduce el valor de B:");
		b = lector.nextInt();
		System.out.println("Por favor, introduce el valor de C:");
		c = lector.nextInt();
		System.out.println("Por favor, introduce el valor de D:");
		d = lector.nextInt();
		
		System.out.println(mayorDeCuatro(a,b,c,d));
		
		lector.close();
	}
	
	public static String mayorDeCuatro(int a, int b, int c, int d) {
		
		if (a > b && a > c && a > d) {
			return "A es el mayor";
		} else if (b > a && b > c && b > d) {
			return "B es el mayor";
		} else if (c > a && c > b && c > d) {
			return "C es el mayor";
		} else if (d > a && d > b && d > c) {
			return "D es el mayor";
		} else {
			return "Caso no contemplado";
		}
		
	}

}
