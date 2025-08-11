package unidad_03;

import java.util.Scanner;

public class Actividad_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que juegue con el usuario a adivinar un número. El ordenador debe
		 * de generar un número entre 1 y 100 y el usuario debe de intentar adivinarlo. Para
		 * hacerlo, cada vez que el usuario introduzca un valor, el ordenador debe de decirle si el
		 * número que debe de adivinar es mayor o menor que el que se ha introducido. Cuando se
		 * consiga adivinarlo, se lo debe de indicar y también le dirá el número de intentos que se
		 * han invertido en adivinarlo.
		 * 
		 * Aquí tienes un ejemplo:
		 * El ordenador ha pensado un número que debes intentar adivinar…
		 * Inserta un número: 50
		 * No llegas.
		 * Inserta un número: 70
		 * Te has pasado.
		 * Inserta un número: 60
		 * No llegas.
		 * Inserta un número: 65
		 * Te has pasado.
		 * Inserta un número: 63
		 * Has acertado!!
		 * Has necesitado 5 intentos.
		 */

		int numUsuario;
		int numRandom;
		int i = 1;
		Scanner lector = new Scanner(System.in);
		
		numRandom = (int)(Math.random() * 100) + 1;
		
		System.out.println(numRandom);
		
		System.out.println("Vamos a jugar a un juego, el ordenador pensará un número y tú tienes que adivinarlo en el menos número de intentos posibles. \nVamos, di un número:");
		numUsuario = lector.nextInt();
		
		do {
			while (numUsuario > numRandom) {
				System.out.println("Te has pasado, vamos, inténtalo otra vez:");
				numUsuario = lector.nextInt();
				i++;
			}
			while (numUsuario < numRandom) {
				System.out.println("Te quedas corto, vamos, inténtalo otra vez:");
				numUsuario = lector.nextInt();
				i++;
			}
			} while (numUsuario != numRandom);
		
		System.out.println("¡¡¡Felicidades has acertado!!! \nLo has conseguido en " + i + (i==1?" intento.": " intentos."));
		lector.close();
	}

}

//FUNCIONA