package unidad_02;

import javax.swing.JOptionPane;

public class Actividad_05_JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementa un programa que visualice en pantalla cuánto dinero le dará un banco a un
		cliente después de 6 meses, si pone 2000€ en una cuenta que le da un 2,75% de interés
		anual. Recuerda que al pagarte intereses, el banco aplica una retención del 18% para
		hacienda.
		*/
		
		double importe_inicial;
		double porcentaje_interes_anual;
		double porcentaje_retencion;
		double interes_anual_euros;
		double interes_6meses;
		double retencion_euros;
		double intereses_finales;
		double importe_final;
		
		importe_inicial = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introduce el importe inicial depositado: "));

		porcentaje_interes_anual = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introduce los intereses anuales: "));

		porcentaje_retencion = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introduce el porcentaje de retención: "));
		
		interes_anual_euros = importe_inicial * (porcentaje_interes_anual / 100);
		interes_6meses = interes_anual_euros / 2;
		retencion_euros = interes_6meses * (porcentaje_retencion / 100);
		intereses_finales = interes_6meses - retencion_euros;
		importe_final = importe_inicial + intereses_finales;
		
		JOptionPane.showMessageDialog(null, 
				"Importe inicial: " + importe_inicial + " €.\n"
				+ "Interés anual: " + interes_anual_euros + " €.\n"
				+ "Interés 6 meses: " + interes_6meses + " €.\n"
				+ "Retención hacienda en 6 meses: " + retencion_euros + " €.\n"
				+ "Intereses finales recibidos: " + intereses_finales + " €.\n"
				+ "Total en la cuenta a los 6 meses: " + importe_final + " €.", null, 0);  //icono cruz roja (error)
		
		JOptionPane.showMessageDialog(null, "Importe inicial: " + importe_inicial + " €.\n"
				+ "Interés anual: " + interes_anual_euros + " €.\n"
				+ "Interés 6 meses: " + interes_6meses + " €.\n"
				+ "Retención hacienda en 6 meses: " + retencion_euros + " €.\n"
				+ "Intereses finales recibidos: " + intereses_finales + " €.\n"
				+ "Total en la cuenta a los 6 meses: " + importe_final + " €."); //icono exclamacion

	}

}
