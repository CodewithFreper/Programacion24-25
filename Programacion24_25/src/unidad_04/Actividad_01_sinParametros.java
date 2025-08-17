package unidad_04;

import java.util.Scanner;

public class Actividad_01_sinParametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un método que devuelva el mayor de tres números que se piden al
		  usuario.
		*/
		
		System.out.println(mayorDeTres());
	}
		
		public static String mayorDeTres() {
			
			int a;
			int b;
			int c;
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Por favor introduce el valor de A:");
			a = lector.nextInt();
			System.out.println("Por favor introduce el valor de B:");
			b = lector.nextInt();
			System.out.println("Por favor introduce el valor de C:");
			c = lector.nextInt();
			
			lector.close();
				if (a > b && a > c) {
					return "A es el mayor.";
					} else if (b > a && b > c) {
						return "B es el mayor.";
					} else if (c > a && c > b){
						return "C es el mayor.";
					} else if (a == b && b ==c){
						return "Los tres números son iguales.";
					} else if (a == b && a > c) {
						return "A y B son iguales y mayores que C.";
					} else if (b == c && c > a) {
						return "B y C son iguales y mayores que A.";
					} else {
						return "A y C son iguales y mayores que B.";
					}
	}
}
//FUNCIONA