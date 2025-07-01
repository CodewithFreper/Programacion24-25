package unidad_02;

public class Actividad_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementa un programa que visualice en pantalla cuánto dinero le dará un banco a un
		cliente después de 6 meses, si pone 2000€ en una cuenta que le da un 2,75% de interés
		anual. Recuerda que al pagarte intereses, el banco aplica una retención del 18% para
		hacienda.
		*/
		
		double importe_inicial = 2000;
		double porcentaje_interes_anual = 2.75;
		double porcentaje_retencion = 18;
		double interes_anual_euros;
		double interes_6meses;
		double retencion_euros;
		double intereses_finales;
		double importe_final;
		
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
