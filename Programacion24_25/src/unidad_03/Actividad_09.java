package unidad_03;

public class Actividad_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Visualizar los números del 1 al 100 indicando al final:
			• Cuántos números pares hay y su suma.
			• Cuántos números impares hay y la suma
			• Cuántos hay que sean múltiplos de cuatro y de siete, y la suma
		*/
		
		int i;
		int numero_de_pares = 0;
		int suma_pares = 0;
		int numero_de_impares = 0;
		int suma_impares = 0;
		int multiplos4 = 0;
		int suma_multiplos4 = 0;
		int multiplos7 = 0;
		int suma_multiplos7 = 0;
		
		
		
		for (i = 1; i <= 100; i++) {
			System.out.println(i);
			
			if (i % 2 == 0) {
				numero_de_pares++;
				//		System.out.println("Hay " + numero_de_pares + " números pares.");   SI SE PONEN AQUÍ LOS SYSTEM.OUT.PRINTLN SE IMPRIMEN CADA VEZ QUE PASAN POR EL BUCLE
				suma_pares +=i;
				// 		System.out.println("La suma de los números pares es: " + suma_pares);	
				
			}
			else if (i % 2 != 0) {
				numero_de_impares++;
				//		System.out.println("Hay " + numero_de_impares + " números impares.");   SI SE PONEN AQUÍ LOS SYSTEM.OUT.PRINTLN SE IMPRIMEN CADA VEZ QUE PASAN POR EL BUCLE
				suma_impares +=i;
				// 		System.out.println("La suma de los números impares es: " + suma_impares);	
				
			}
			if (i % 4 == 0) {
				multiplos4++;
				//		System.out.println("Hay " + multiplos4 + " números múltiplos de 4.");   SI SE PONEN AQUÍ LOS SYSTEM.OUT.PRINTLN SE IMPRIMEN CADA VEZ QUE PASAN POR EL BUCLE
				suma_multiplos4 +=i;
				// 		System.out.println("La suma de los múltiplos de 4 es: " + suma_multiplos4);	
				
			}
			else if (i % 7 == 0) {
				multiplos7++;
				//		System.out.println("Hay " + multiplos7 + " números múltiplos de 7.");   SI SE PONEN AQUÍ LOS SYSTEM.OUT.PRINTLN SE IMPRIMEN CADA VEZ QUE PASAN POR EL BUCLE
				suma_multiplos7 +=i;
				// 		System.out.println("La suma de los múltiplos de 7 es: " + suma_multiplos7);	
				
			}
		}
		System.out.println("Hay " + numero_de_pares + " números pares.");
		System.out.println("La suma de los números pares es: " + suma_pares);
		
		System.out.println("Hay " + numero_de_impares + " números impares.");
		System.out.println("La suma de los números impares es: " + suma_impares);
		
		System.out.println("La suma de los múltiplos de 4 es: " + suma_multiplos4);	
		System.out.println("Hay " + multiplos4 + " números múltiplos de 4.");
		
		System.out.println("La suma de los múltiplos de 7 es: " + suma_multiplos7);	
		System.out.println("Hay " + multiplos7 + " números múltiplos de 7.");
	}

}

//FUNCIONA

