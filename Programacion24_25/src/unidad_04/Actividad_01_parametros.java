package unidad_04;

import java.util.Scanner;

public class Actividad_01_parametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		Scanner lector = new Scanner(System.in);
		
		
		//Solicitamos al usuario que introduzca los valores de las variables que luego le pasaremos al método como parámetro
		System.out.println("Por favor, introduce el valor de A:");
		a = lector.nextInt();
		System.out.println("Por favor, introduce el valor de B:");
		b = lector.nextInt();
		System.out.println("Por favor, introduce el valor de C:");
		c = lector.nextInt();
		
		
		//Llamamos e imprimimos el return del método
		System.out.println(mayorDeTres(a,b,c));
	}
	
	//Construimos el método, especificando el tipo de valor que retorna y el tipo de valor que recibe.
	public static String mayorDeTres(int a, int b, int c) {
		
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
