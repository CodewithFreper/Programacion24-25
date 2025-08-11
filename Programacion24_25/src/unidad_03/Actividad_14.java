package unidad_03;

public class Actividad_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * El programa debe de simular que se lanza una moneda un número elevado de veces, por
		 * ejemplo, 1.000.000. A continuación debe de imprimir por pantalla el número de caras y
		 * el número de cruces que han salido. Tambien se debe de mostrar el porcentaje que
		 * representa cada valor.
		 * 
		 * Aquí hay un ejemplo:
		 * Número de caras: 500627 (50.0627%)
		 * Número de cruces: 499373 (49.9373%)
		 */
 
		int caras = 0;
		int cruces = 0;
		int veces = 1000000;
		double porcentCaras;
		double porcentCruces;
		int i;
		double aleatorio;
		
		System.out.println("Lanzamiento de moneda");
		System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n");
		
		for (i = 0 /*1*/; i </*=*/veces; i++) { // Al inicializar la i en 0, cuando había puesto i <= veces, se ejecutaba 1000001 veces, por lo que el chivato de la comprobación nos decía que no era correcto.
			aleatorio = Math.random();
			if (aleatorio < 0.5) {
				caras++;
			} else {
				cruces++;
			}
		}
		
		porcentCaras = caras * 100 / veces; //si ponemos caras / veces * 100 dará 0 porque redondea antes de multiplicar
		porcentCruces = cruces * 100 / veces ;
		
		
		System.out.println("Número de caras: " + caras + "(" + porcentCaras + ")\nNúmero de cruces: " + cruces + "(" + porcentCruces + ")");
		
		if(caras + cruces == veces) {
			System.out.println("Los resultados han sido comprobados y son correctos.");
		} else {
			System.out.println("Los resultados no son correctos.");
		}

		
		
	}

}
// FUNCIONA