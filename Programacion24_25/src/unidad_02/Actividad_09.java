package unidad_02;

import java.util.Scanner;

public class Actividad_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que solicite al usuario una cantidad de segundos y los convierta en
		 * días, horas, minutos y segundos. Visualiza el resultado por pantalla.
		 */
		
		int input;
		int segundos;
		int minutos; 
		int horas;
		int dias;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce una cantidad de segundos: ");
		input = lector.nextInt();
		
		/*
		 * Sacamos los minutos, dividimos los segundos que nos da el usuario entre 60, 
		 * como ambos son int, nos devuelve un int. Si la operación no es exacta habrá un resto, 
		 * ese resto serían los minutos. Para saber el resto, utilizamos el operador modulo, en la 
		 * variable segundos guardaremos el resultado de segundos%60. 
		 * Al continuar, debemos dividir primero los minutos entre 60 para sacar las horas, ya que
		 * si hacemos antes minutos%60 al guardar el resultado en la variable minutos no podriamos sacar las horas.
		 * Por eso, primero dividimos para sacar los enteros y después hacemos el módulo para sacar el resto.
		 */
		
		minutos = input / 60;
		segundos = input % 60;
		horas = minutos / 60; 
		minutos = minutos % 60;
		dias = horas / 24;
		horas = horas % 24;
		
		System.out.println(input + " segundos son:\n" + dias +" días,\n" + horas + " horas,\n" + minutos + " minutos y\n" + segundos + " segundos.");


		

	}

}
