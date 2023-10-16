package com.kh.circleMVC;

public class CircleMain {
	//원 정보 다루는 곳
	public static void main(String[] args) {
		//모델, 뷰, 컨트롤러 객체 생성 후 컨트롤러 모델 뷰 설정
		CircleModel Model = new CircleModel();
		CircleView View = new CircleView();
		CircleController Controller = new CircleController(Model, View);
		
		Controller.run();
		
	}

}