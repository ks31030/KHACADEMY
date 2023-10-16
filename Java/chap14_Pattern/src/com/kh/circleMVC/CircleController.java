package com.kh.circleMVC;

public class CircleController {
	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}

	public void run() {
		double userInput = view.getUserInput();
		model.setRadius(userInput);
		
		double result = model.CircleArea();{
		view.runResult(result);
		}
		
	}

}
