package unidad_04;

import java.util.Scanner;

public class Actividad_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un método que reciba 4 parámetros de tipo entero y compruebe si la secuencia
		* de números es capicua.
		*/
		
		int a, b, c, d; 
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el valor de A:");
		a = lector.nextInt();
		System.out.println("Introduce el valor de B:");
		b = lector.nextInt();
		System.out.println("Introduce el valor de C:");
		c = lector.nextInt();
		System.out.println("Introduce el valor de D:");
		d = lector.nextInt();
		
		System.out.println(capicua(a, b, c, d));
		
		lector.close();

	}
	
	public static String capicua(int a, int b, int c, int d) {
		String resultado;
		String secuencia= "";
		String secuenciaAlReves;
		//int largoSecuencia;
		
		
		secuencia = Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d);
		
		/*Creamos el StringBuilder para poder utilizar el método reverse, pero 
		para almacenar el resultado de ese reverse en secuenciaAlReves hay que pasarlo a String.*/
		
		StringBuilder constructor = new StringBuilder(secuencia);
		secuenciaAlReves = constructor.reverse().toString();
		
		/* Mejor utilizando StringBuilder
		 * 
		 * largoSecuencia = secuencia.length();
		 * 
		 * if ((secuencia.charAt(secuencia.length()-1)) == (secuencia.charAt(0))){ 
		 * 
		 * }
		*/
		
		/* StringBuilder	
		 * reverse()	
		 * Causes this character sequence to be replaced by the reverse of the sequence.
		 */
		
		if (secuencia.equals(secuenciaAlReves)) {
			resultado = "La secuencia es capicúa.";
		} else { resultado = "La secuencia NO es capicúa.";
		}
		return resultado; 
	}

}

//FUNCIONA