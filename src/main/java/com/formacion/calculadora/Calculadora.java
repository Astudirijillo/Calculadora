package com.formacion.calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones op1 = new Operaciones();
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<>();
		ArrayList<String> operadores = new ArrayList<>();
		Integer salida = 0;
		String salidaOP = "";
		int vuelta = 0;

		/*
		 * op1.setOperandOne(10.5); op1.setOperandTwo(5.2); op1.setOperation("+");
		 * 
		 * op1.performOperation(); System.out.println("El resultado es " +
		 * op1.getResult());
		 */

		do {
			System.out.println("Ingrese valor numero " + (vuelta + 1) + ":");
			salida = teclado.nextInt();
			valores.add(salida);
			vuelta++;
			System.out.println("Ingrese operador a ejecutar: ");
			salidaOP = teclado.next();
			operadores.add(salidaOP);
			System.out.println(" ");
			System.out.println("Ingrese valor numero " + (vuelta + 1) + ":");
			salida = teclado.nextInt();
			valores.add(salida);
			vuelta++;
			System.out.println("Para finalizar escriba salir, si no presione Enter:");
			salidaOP = teclado.next();
			valores.add(salida);
		} while (salidaOP == "salir");

		op1.performOperation(valores, operadores);
		System.out.println("El resultado es " + op1.getResult());
	}

}
