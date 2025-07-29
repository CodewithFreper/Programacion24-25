package unidad_03;

public class Actividad_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Visualizar las tablas de multiplicar del 1 al 10.
		*/
		
		int i;
		int j;
		int tabla;
		
		for (j = 0; j <= 10; j++) {
			
			System.out.println("TABLA DEL " + j);
			for (i = 0; i <= 10; i++) {
				
				tabla = j * i;	
				System.out.println(j + " x " + i + " = " + tabla);
			}
		}
		
	}

}
//FUNCIONA