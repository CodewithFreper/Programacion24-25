package unidad_02;

import javax.swing.JOptionPane;

public class Actividad_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa para calcular y mostrar el área (A =2PIr2 + 2PIrh) y el volumen
		 * (V=PIr 2·h) de un cilindro. Los valores del diámetro y la altura se le pedirán al usuario.
		 */
		
		double diametro;
		double altura;
		double area;
		double volumen;
		
		diametro = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introduce la altura del cilindro:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introdue el diámetro del cilindro:"));
		
		area = 2 * Math.PI * Math.pow(diametro/2, 2) + 2 * Math.PI * (diametro/2) * altura;
		System.out.println("El área es: " + area + "cm2.");
		
		volumen = Math.PI * (diametro/2) * 2 * altura;
		System.out.println("El volumen es: " + volumen + "cm3.");
		
		JOptionPane.showMessageDialog(null, "El área es: " + area + "cm2.\nEl volumen es: " + volumen + "cm3.");

	}

}
