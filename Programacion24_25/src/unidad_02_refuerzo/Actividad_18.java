package unidad_02_refuerzo;

import java.util.Scanner;

public class Actividad_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que calcula el salario neto semanal de un trabajador
		 * en función del número de horas trabajadas y la tasa de impuestos de
		 * acuerdo a las siguientes hipótesis:
		 * • Las primeras 35 horas se pagan a tarifa normal.
		 * • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
		 * • Las tasas de impuestos son:
		 * 		• Los primeros 500 euros son libres de impuestos.
		 * 		• Los siguientes 400 tienen un 25% de impuestos.
		 * 		• Los restantes un 45% de impuestos.
		 * Escribir nombre, salario bruto, tasas y salario neto.
		 */
		
		double horas;
		double precio_hora;
		double precio_extra;
		double salario_bruto;
		double tasas = 0;
		double impuesto_25 = 0;
		double impuesto_45 = 0;
		double salario_neto;
		String nombre;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor, introduce tu nombre: ");
		nombre = lector.next();
		System.out.println("Por favor, introduce las horas trabajadas esta semana: ");
		horas = lector.nextDouble();
		
		precio_hora = 20;
		precio_extra = precio_hora * 1.5;
		salario_bruto = 35 * precio_hora + (horas - 35) * precio_extra;
		
		
		if (salario_bruto > 900) {
			impuesto_45 = (salario_bruto - 900) * 0.45;
			impuesto_25 = 400 * 0.25;
		}
		else if (salario_bruto > 500 && salario_bruto <= 900) impuesto_25 = (salario_bruto - 500) * 0.25;
				
		tasas = impuesto_25 + impuesto_45;
		salario_neto = salario_bruto - tasas;
		
		
		System.out.println("Nombre: " + nombre + "; \nSalario bruto: " + salario_bruto + "€ br/sem; \nTasas: " + tasas + "€; \nSalario neto: " + salario_neto + "€ net/sem.");
		
		lector.close();
		
	}

}
