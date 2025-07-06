package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que toma como dato de entrada un número que
		 * corresponde a la longitud de un radio y nos escribe la longitud de la
		 * circunferencia, el área del círculo y el volumen de la esfera que corresponden
		 * con dicho radio
		 */
		
		int radio;
		double circunferencia;
		double area;
		double volumen; 
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce el radio: ");
		radio = lector.nextInt();
		
		circunferencia = 2 * radio * Math.PI;
		area = Math.PI * Math.pow(radio, 2);
		volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
		
		System.out.println("La circunferencia de una esfera de " + radio + "cms de radio es: " + circunferencia + "cms.\nEl área de una esfera de " + radio + "cms de radio es: " + area + "cm2.\nEl volumen de una esferda de " + radio + "cms de radio es: " + volumen + "cm3.");
		
		lector.close();
	}

}
