package com.formacion.calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		// Calculadora Parte 1

		Operaciones op1 = new Operaciones();

		op1.setOperandOne(10.5);
		op1.setOperation("+");
		op1.setOperandTwo(5.2);
		op1.performOperation();
		System.out.println("1er resultado: " + op1.getResult());

		// Calculadora Parte 2

		Operaciones op2 = new Operaciones();
		op2.performOperation(10.5);
		op2.performOperation("+");
		op2.performOperation(5.2);
		op2.performOperation("*");
		op2.performOperation(10);
		op2.performOperation("*");
		op2.performOperation(10);
		op2.performOperation("/");
		op2.performOperation(2);
		op2.performOperation("-");
		op2.performOperation(100);
		op2.performOperation("=");

		System.out.println("2do resultado: " + op2.getResult());

	}

}
