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

	public void executeOperacion(int i) {
		while (i == 0) {
			setOperandOne(getValores().get(i));
			setOperandTwo(getValores().get(i + 1));
			setOperation(getOperadores().get(i));
			performOperation();
			if (getOperadores().size() == 0 && getValores().size() == 0) {
				i++;
			}
		}
	}

	@Override
	public double getResult() {
		executeOperacion(0);
		return getResult();
	}

}
