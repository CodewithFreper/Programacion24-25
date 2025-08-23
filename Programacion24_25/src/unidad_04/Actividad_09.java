package unidad_04;

import java.util.Scanner;

public class Actividad_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que, dado el nombre de una persona y su idioma de preferencia,
		 * escriba en pantalla un mensaje de saludo a esa persona con el idioma elegido, del tipo
		 * “Good morning Pepe Sánchez). Los idiomas disponibles serán:
		 * (a) Valenciano
		 * (b) Castellano
		 * (c) Inglés
		 * El mensaje se mostrará desde un método al que se le pasa el nombre y el código del
		 * idioma. Por ejemplo, en el caso anterior, la llamada sería saludos(“Pepe Sánchez”,'b').
		 */
		
		String name;
		char option;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		name = lector.nextLine(); //si utilizamos lector.next() en vez de nextLine(), si el nombre tiene espacios no lo lee completo
		do {
			System.out.println("Introduce la opción que deseas (a, b, c) de las siguientes: \na) Valenciano\nb) Castellano\nc) Inglés");
			option = lector.next().charAt(0);
			if (option !='a' && option !='b' && option != 'c') {
				System.out.println("Por favor, introduce una opción correcta.\n");
			}
			} while (option !='a' && option !='b' && option != 'c');
		
		lector.close();
		
		System.out.println(saludos(name, option));
	}
	
	public static String saludos(String name, char option) {
		String saludo = "";
		if (option == 'a') {
			saludo = "Bon día, " + name;
		} else if (option == 'b') {
			saludo =  "Buenos días, " + name;
		} else if (option == 'c') {
			saludo =  "Good morning, " + name;
		} else {
		
		}
		
		return saludo; 
		
	}

}
//FUNCIONA
