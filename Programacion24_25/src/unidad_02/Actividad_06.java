package unidad_02;

import java.util.Scanner;

public class Actividad_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementa un programa que pida al usuario dos números, los guarde en dos variables
		* e intercambie los valores. Debe de mostrar los valores intercambiados.
		*/
		
		Scanner lector = new Scanner(System.in);
		int a;
		int b;
		int c; //para guardar valor intercambiado
		
		System.out.println("Por favor, introduzca el valor de a: ");
		a = lector.nextInt();
		
		System.out.println("Por favor, introduzca el valor de b: ");
		b = lector.nextInt();
		
		System.out.println("El valor de a es: " + a + " y el valor de b es: " + b + ".");
		
		//Intercambiamos valores, para ello almacenamos el valor de a en c, y ponemos el valor de b en a, finalmente podremos el valor de c en b.
		c = a;
		a = b;
		b = c;
		
		System.out.println("Los valores después del intercambio son:\na: " + a + "\nb: " + b);
		
		lector.close();
		
		
	}

}
