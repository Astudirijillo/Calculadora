package com.formacion.calculadora;

import java.util.ArrayList;

public class Resultados extends Operaciones {
	public boolean isMult = false;
	public boolean isDiv = false;

	public boolean isMult() {
		return isMult;
	}

	public void setMult(boolean isMult) {
		this.isMult = isMult;
	}

	public boolean isDiv() {
		return isDiv;
	}

	public void setDiv(boolean isDiv) {
		this.isDiv = isDiv;
	}

	public void executeOperacion() {
		double auxResult = 0.0;
		int ciclo = 0;
		do {
			setOperandOne(getValores().get(ciclo));
			setOperandTwo(getValores().get(ciclo + 1));
			setOperation(getOperadores().get(ciclo));
			performOperation();
			auxResult += getResult();
			if (getValores().size() == 1 || getOperadores().size() == 1) {
				ciclo++;
			} else {
				getValores().remove(ciclo);
				getValores().remove(ciclo + 1);
				getOperadores().remove(ciclo);
			}
		} while (ciclo != 0);
		super.setResult(auxResult);
	}

	@Override
	public double getResult() {
		super.getResult();
		executeOperacion();
		return getResult();
	}

}
