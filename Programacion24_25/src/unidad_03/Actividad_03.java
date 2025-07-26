package unidad_03;

import java.util.Scanner;

public class Actividad_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Escribe un programa que calcule la cuota que se debe de abonar en un club de golf. La
		cuota general es de 500€. Tendrán un 50% de descuento las personas mayores de 65
		años y un 25% los menores de 18 años si los padres no son socios y el 35% si los
		padres son socios.
		Pide al usuario el nombre, la edad y si sus padres son socios o no. Muestra a
		continuación la información que ha de pagar. Aquí tienes algunos ejemplos:
		*/
		
		final double general = 500;
		double dto_senior = 0.5 * general;
		double dto_junior = 0.25 * general;
		double dto_junior_socio = 0.35 * general;
		String nombre;
		int edad;
		String padres_socios;
		
		Scanner lector = new Scanner(System.in);		
		
		// Pedimos los datos al usuario
		
		System.out.println("Nombre:");
		nombre = lector.next();
		System.out.println("Edad:");
		edad = lector.nextInt();

		
		// Empezamos con la lógica
		
		if (edad >= 65) {
			System.out.println("La cuota que debe abonar es: " + (general - dto_senior) + "€.");
		}
		else if (edad < 18) {
			System.out.println("¿Tus padres son socios? S/N");
			padres_socios = lector.next();
			if (padres_socios.equalsIgnoreCase("s")) {
				System.out.println("La cuota que debe abonar es: " + (general - dto_junior_socio) + "€.");
			}
			else if (padres_socios.equalsIgnoreCase("n")) {
				System.out.println("La cuota que debe abonar es: " + (general - dto_junior) + "€.");
			}
			else {
				while (!padres_socios.equalsIgnoreCase("s") || !padres_socios.equalsIgnoreCase("n") ) {
				
					System.out.println("Por favor, introduce S o N.");
					padres_socios = lector.next();
				}
			}
		}
		else {
			System.out.println("La cuota que debe abonar es: " + general + "€.");
		}
		
	}

}
