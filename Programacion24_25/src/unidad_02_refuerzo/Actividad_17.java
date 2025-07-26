package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que recibe como datos de entrada una hora
		 * expresada en horas, minutos y segundos que nos calcula y escribe la hora,
		 * minutos y segundos que serán, transcurrido un segundo.
		 */
		
		int horas;
		int minutos;
		int segundos;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe las horas:");
		horas = lector.nextInt();
		System.out.println("Escribe los minutos:");
		minutos = lector.nextInt();
		System.out.println("Escribe los segundos:");
		segundos = lector.nextInt();
		
		System.out.println("La hora actual es: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		segundos++;
		System.out.println("Transcurrido un segundo, la hora será: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

		lector.close();
	}

}
