package unidad_02_refuerzo;

public class Actividad_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5
		
		int lado = 5;
		int area;
		
		// area = lado * lado;
		area = (int) Math.pow(lado, 2);
		
		System.out.println("El área de un cuadrado de lado igual a 5 es: " +  area);

	}

}
