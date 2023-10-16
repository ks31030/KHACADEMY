package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
//		model = CalculatorModel 가져오기
//		view = CalculatorView 가져오기
//		controller = CalculatorController 가져오기
		CalculatorModel Model = new CalculatorModel();
		CalculatorView View = new CalculatorView();
		CalculatorController Controller = new CalculatorController(Model, View);
		
		Controller.run();
	}

}
