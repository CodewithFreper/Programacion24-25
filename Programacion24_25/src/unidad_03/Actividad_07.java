package unidad_03;

public class Actividad_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Muestra los números impares del 1 al 99 indicando al final cuántos son. Repetir para los
		pares y para los múltiplos de cinco.
		*/
		
		int i;
		int j = 0;
		int ii;
		int jj = 0; 
		int iii; 
		int jjj = 0;
		
		
		System.out.println("NÚMEROS IMPARES:");
		
		for (i = 1; i < 99; i +=2) {
			System.out.println(i);
			j++;
			}
		System.out.println("Los números impares que hay entre 1 y 99 son: " + j);
		
		System.out.println("NÚMEROS PARES:");
		
		for (ii = 0; ii < 99; ii += 2) {
			System.out.println(ii);
			jj++;
		}
		System.out.println("Los números pares que hay entre 1 y 99 son: " + jj);
		
		System.out.println("NÚMEROS MÚLTIPLOS DE 5:");
		
		for (iii = 5; iii < 99; iii += 5) {
			System.out.println(iii);
			jjj++;
		}
		System.out.println("Los números múltiplos de cinco son: " + jjj);
	}

}
