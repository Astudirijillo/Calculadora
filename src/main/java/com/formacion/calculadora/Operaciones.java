package com.formacion.calculadora;

import java.util.ArrayList;

public class Operaciones {

	public double operandOne;
	public double operandTwo;
	public String operation;
	public double result;

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setOpperation(String operation) {
		if (operation.equals("+") || operation.equals("-")) {
			this.operation = operation;
		} else {
			System.out.println("Operador incorrecto");
		}
	}

	public double performOperation(ArrayList<Integer> val, ArrayList<String> op) {
		/*
		 * if (this.operation.equals("+")) { this.result = operandOne + operandTwo; }
		 * else if (this.operation.equals("-")) { this.result = operandOne - operandTwo;
		 * }
		 */
		int val1 = 0;
		for (int i = 0; i < val.size(); i++) {
			val1 = val.indexOf(i);
			for (int x = 0; i < op.size(); i++) {
			}
		}

		return result;
	}

	public double getResult() {
		return result;
	}

}
