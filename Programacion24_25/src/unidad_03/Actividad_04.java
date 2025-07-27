 
package unidad_03;

public class Actividad_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		public class Loopy {
			public static void main (String[] args) {
				int x = 1; --> No hay condición, no imprime nada.
					System.out.println("Abans del bucle"); --> Imprime "Abans del bucle."
				while (x < 4) {  --> condición x menor que 4, sí se cumple, entra en el bucle.
					System.out.println("En el bucle"); --> Imprime "En el bucle"
					System.out.println("El valor d'x és " + x); --> Imprimer el valor de X, que de momento sigue siendo 1.
					x = x + 1; --> Suma 1 a x, que pasará a ser 2, como es menor que 4, volverá a entrar al bucle., imprimirá "En el bucle" 
					e imprimirá el valor de x que ya será 2, y volverá a sumar 1, y volverá a entrar en el bucle porque será 3, y 3 cumple
					la condición de x < 4, imprimirá "En el bucle", imprimirá el valor de x, y pasará a sumar 1 a x, la cual valdrá 4 y 
					al no cumplirse la condición de x < 4 porque 4 no es menor que 4, saltará el bucle.
				}
				System.out.println("Després del bucle"); --> cuando la x llegue a tener un valor de 4 imprimirá "después del bucle".
			}
		} 
		 */
		
		int x = 1; 
		System.out.println("Abans del bucle.");
		while (x < 4) {
			System.out.println("En el bucle.");
			System.out.println("El valor d'x és: " + x);
			x = x + 1;
		}
		System.out.println("Després del bucle.");
	}
}
