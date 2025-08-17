package unidad_04;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un método que acepte tres argumentos: un carácter y dos enteros. el carácter se 
		 * debe de imprimir. El primer entero indica el número de veces que se debe de imprimir el
		 * carácter y el segundo entero indica el número de líneas que se debe de imprimir.
		 */
		
		//Creamos las variables y el scanner
		char caracter;
		int veces;
		int lineas;
		Scanner lector = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca los valores que almacenaremos en esas variables
		System.out.println("Introduce un carácter:");
		caracter = lector.next().charAt(0);
		System.out.println("Introduce el número de veces que se imprimirá dicho carácter:");
		veces = lector.nextInt();
		System.out.println("Introduce el número de líneas que se imprimirán:");
		lineas = lector.nextInt();
		
		lector.close();
		
		System.out.println(caracterVecesYLineas(caracter, veces, lineas));
	}
	
		//Construimos el método fuera del método main
		public static String caracterVecesYLineas(char caracter, int veces, int lineas){
			String resultado = ""; 
			//Inicializo el resultado vacío
			
			for (int i = lineas; i > 0; i--) {
				/*Bucle for externo, cada vez que pase almacenará el resultado (que será el que sale en el 
				bucle interno) más un salto de línea 
				(si el bucle se repite 3 veces porque en la variable lineas el usuario ha almacenado un 3, 
				hará 3 saltos de línea)
				*/
				
				for (int j = veces; j > 0; j--) {
					/*Bucle for interno, cada vez que pase almacenará el resultado más el carácter
					 * 
					 */
					resultado += caracter;
				} 
				
				//Al acabar el bucle interno es cuando el bucle externo almacena el resultado más el salto de línea
				resultado += "\n";
			}
			return resultado;
		}
	
}
//FUNCIONA