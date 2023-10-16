package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
//		model = CalculatorModel ��������
//		view = CalculatorView ��������
//		controller = CalculatorController ��������
		CalculatorModel Model = new CalculatorModel();
		CalculatorView View = new CalculatorView();
		CalculatorController Controller = new CalculatorController(Model, View);
		
		Controller.run();
	}

}
