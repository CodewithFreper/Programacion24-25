package unidad_04;

import java.util.Scanner;

public class Actividad_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Escribe un método que acepte dos argumentos: el carácter que se desea imprimir y el
		 * número de veces que se debe de imprimir.
		 */

		char caracter;
		int numero;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el carácter que deseas imprimir:");
		caracter = lector.next().charAt(0); //Para que el scanner lea un char debemos poner next() pero como eso lee Strings debemos añadir charAt() y la posición para que guarde un carácter y no un string
		System.out.println("Introduce el número de veces que quieres que se repita:");
		numero = lector.nextInt();
		
		System.out.println(caracterYVeces(caracter, numero));
		
		lector.close();
	}
	
	public static String caracterYVeces(char caracter, int numero) {
		String resultado = ""; //Inicializamos el string resultado vacío
		for(int i = numero; i > 0; i--) { //ponemos un contador inicializado con el valor numero y lo vamos disminuyendo hasta llegar a 0 para que repita lo del bucle tantas veces como dice el número
			resultado += caracter; //a resultado que al comienzo es ""(nada) le añadimos el carácter cada vez que se repite el bucle, de modo que se pondrá el caracter tantas veces como dice el número
		}
		return resultado;
		
	}

}
