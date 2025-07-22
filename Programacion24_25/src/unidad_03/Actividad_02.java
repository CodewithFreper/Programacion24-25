package unidad_03;

import java.util.Scanner;

public class Actividad_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que solicite al usuario un valor real que simbolizará una cantidad de
		 * dinero en euros. El programa debe mostrar por pantalla la cantidad mínima de monedas
		 * de cada tipo para devolver la cantidad de dinero indicada.
		 */
		
		int cantidad;
		int eu2;
		int eu1;
		int cent50;
		int cent20;
		int cent10;
		int cent5;
		int cent2;
		int cent1;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad: ");
		cantidad = lector.nextInt();
		
		eu2 = cantidad / 200;
		System.out.println("Monedas de 2 euros: " + eu2);
		cantidad = cantidad % 200;
		eu1 = cantidad / 100;
		System.out.println("Monedas de 1 euro: " + eu1);
		cantidad = cantidad % 100;
		cent50 = cantidad / 50;
		System.out.println("Monedas de 50 céntimos: " + cent50);
		cantidad = cantidad % 50;
		cent20 = cantidad / 20;
		System.out.println("Monedas de 20 céntimos: " + cent20);
		cantidad = cantidad % 20;
		cent10 = cantidad / 10;
		System.out.println("Monedas de 10 céntimos: " + cent10);
		cantidad = cantidad % 10;
		cent5 = cantidad / 5;
		System.out.println("Monedas de 5 céntimos: " + cent5);
		cantidad = cantidad % 5;
		cent2 = cantidad / 2;
		System.out.println("Monedas de 2 céntimos: " + cent2);
		cantidad = cantidad % 2;
		cent1 = cantidad / 1;
		System.out.println("Monedas de 1 céntimo: " + cent1);
	}
}
