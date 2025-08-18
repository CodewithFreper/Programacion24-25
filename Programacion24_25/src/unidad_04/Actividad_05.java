package unidad_04;

import java.util.Scanner;

public class Actividad_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escribe un método que acepte dos argumentos: el carácter que se quiere imprimir y el
		 * número de líneas que se imprimirán de forma triangular.
		 *    a
		 *   aaa
		 *  aaaaa 
		 * aaaaaaa
		 */
		
		char caracter; 
		int lineas;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el carácter que quieres imprimir:");
		caracter = lector.next().charAt(0);
		
		System.out.println("Introduce el número de líneas que quieres que se impriman:");
		lineas = lector.nextInt();
		
		System.out.println(triangulo(caracter, lineas));
		
		lector.close();
		
	}

	public static String triangulo(char caracter, int lineas) {
		int i;
		String resultado = "";
		
		for (i = 1; i <= lineas; i++) { // si pones la condición del for así el triángulo sale invertido (i = lineas; i > 0; i--) 
			
			//ESPACIOS
			//sacamos cuántos espacios hay que imprimir antes del carácter
			int espacios;
			espacios = lineas - i;
			//hacemos bucle cuyo contador empiece en el número de espacios y que cada vez que pase hasta llegar a 0 sume un espacio.
			int j;
			for (j = espacios; j > 0; j--) {
				resultado += " ";
			}
			
			//CARACTERES
			//sacamos cuántos caracteres se imprimen
			int caracteres;
			caracteres = 2 * i - 1;
			//hacemos bucle con el contador inicializado en el número de caracteres a imprimir
			int k; 
			for (k = caracteres; k > 0; k-- ) {
				resultado += caracter;
			}
			
			resultado += "\n";
			
		}
	return resultado; 
	}
	
}
