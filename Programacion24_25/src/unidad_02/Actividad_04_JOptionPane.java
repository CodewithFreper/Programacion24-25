package unidad_02;

import javax.swing.JOptionPane;

public class Actividad_04_JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementa un programa que muestra cuánto valdrán unas deportivas con un precio de
		* 85.00 euros, si están rebajadas un 15%.
		* Utilizando la clase JOptionPane.*/
		

		double porcentaje;
		double porcentaje_decimal;
		double precio_antes;
		double precio_final;
	
		precio_antes = Double.parseDouble(JOptionPane.showInputDialog("Cuál es el precio?"));

		porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Cuál es el descuento?"));
		
		porcentaje_decimal = porcentaje / 100;
		precio_final = precio_antes - precio_antes*porcentaje_decimal;
		
		JOptionPane.showMessageDialog(null, "El precio final es: " + precio_final + " €.");
		
	}

}
