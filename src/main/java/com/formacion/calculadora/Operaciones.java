package com.formacion.calculadora;

import java.util.ArrayList;

public class Operaciones {

	public double operandOne;
	public double operandTwo;
	public String operation;
	public double result;

	public ArrayList<Double> valores = new ArrayList<>();
	public ArrayList<String> operadores = new ArrayList<>();

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void performOperation() {
		switch (operation) {
		case "+":
			setResult(getResult() + (getOperandOne() + getOperandTwo()));
			break;
		case "-":
			setResult(getResult() + (getOperandOne() - getOperandTwo()));
			break;
		case "*":
			setResult(getResult() + (getOperandOne() * getOperandTwo()));
			break;
		case "/":
			setResult(getResult() + (getOperandOne() / getOperandTwo()));
			break;
		}
	}

	public void performOperation(Double valor) {
		valores.add(valor);
	}

	public void performOperation(int valor) {
		Double d = (double) valor;
		valores.add(d);
	}

	public void performOperation(String operacion) {
		operadores.add(operacion);
	}

	public ArrayList<Double> getValores() {
		return valores;
	}

	public ArrayList<String> getOperadores() {
		return operadores;
	}

	public void setValores(ArrayList<Double> valores) {
		this.valores = valores;
	}

	public void setOperadores(ArrayList<String> operadores) {
		this.operadores = operadores;
	}

}
