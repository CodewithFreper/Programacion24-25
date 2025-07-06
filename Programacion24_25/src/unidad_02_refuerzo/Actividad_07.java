package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un programa que lea un valor correspondiente a una distancia en
		* millas marinas y escriba la distancia en metros. Sabiendo que una milla
		* marina equivale a 1.852 metros.
		*/
		
		double millas;
		double metros;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce las millas que quieres convertir en metros:");
		millas = lector.nextDouble();
		
		metros = millas * 1852;
		
		System.out.println(millas + " millas, son: " + metros + " metros.");
		
		lector.close();

	}

}
