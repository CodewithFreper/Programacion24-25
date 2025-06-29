package unidad_02;

public class Actividad_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementa un programa que muestra cuánto valdrán unas deportivas con un precio de
		* 85.00 euros, si están rebajadas un 15%. */
		
		double porcentaje = 15;
		double porcentaje_decimal = porcentaje / 100;
		double precio_antes = 85.00;
		double precio_final = precio_antes - precio_antes*porcentaje_decimal;
	
		System.out.println("El precio final es: " + precio_final + "€.");
		
		

	}

}
