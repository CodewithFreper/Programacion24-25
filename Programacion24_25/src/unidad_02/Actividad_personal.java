package unidad_02;

import java.util.Scanner;

public class Actividad_personal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementar un programa que dandole un PVP saque la base imponible, es decir, el precio antes del IVA*/
		
		Scanner lector = new Scanner(System.in);
		double PVP;
		double IVA;
		double base_imponible;
		
		System.out.println("Introduce el PVP:");
		PVP = lector.nextDouble();
		
		System.out.println("Indica el IVA (4, 10, 21)");
		IVA = lector.nextInt();
		
		base_imponible = PVP / (1+ IVA/100);
		
		System.out.println("La base imponible es: " + base_imponible + "€.");

	}

}
