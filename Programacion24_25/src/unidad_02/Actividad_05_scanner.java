package unidad_02;

import java.util.Scanner;

public class Actividad_05_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementa un programa que visualice en pantalla cuánto dinero le dará un banco a un
		cliente después de 6 meses, si pone 2000€ en una cuenta que le da un 2,75% de interés
		anual. Recuerda que al pagarte intereses, el banco aplica una retención del 18% para
		hacienda.
		*/
		
		Scanner lector = new Scanner(System.in);
		double importe_inicial;
		double porcentaje_interes_anual;
		double porcentaje_retencion;
		double interes_anual_euros;
		double interes_6meses;
		double retencion_euros;
		double intereses_finales;
		double importe_final;
		
		System.out.println("Por favor, introduce el importe inicial depositado: ");
		importe_inicial = lector.nextDouble();
		
		System.out.println("Por favor, introduce los intereses anuales: ");
		porcentaje_interes_anual = lector.nextDouble();
		
		System.out.println("Por favor, introduce el porcentaje de retención: ");
		porcentaje_retencion = lector.nextDouble();
		
		
		interes_anual_euros = importe_inicial * (porcentaje_interes_anual / 100);
		interes_6meses = interes_anual_euros / 2;
		
		System.out.println("Importe inicial: " + importe_inicial + " €.\nInterés anual: " + interes_anual_euros + " €. \nInterés 6 meses: " + interes_6meses + " €.");
		
		retencion_euros = interes_6meses * (porcentaje_retencion / 100);
		System.out.println("Retención hacienda en 6 meses: " + retencion_euros + " €.");
		
		intereses_finales = interes_6meses - retencion_euros;
		importe_final = importe_inicial + intereses_finales;
		
		System.out.println("Intereses finales recibidos: " + intereses_finales + " €.\nTotal en la cuenta a los 6 meses: " + importe_final + " €.");
	}

}
