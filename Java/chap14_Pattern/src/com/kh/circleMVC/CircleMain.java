package com.kh.circleMVC;

public class CircleMain {
	//�� ���� �ٷ�� ��
	public static void main(String[] args) {
		//��, ��, ��Ʈ�ѷ� ��ü ���� �� ��Ʈ�ѷ� �� �� ����
		CircleModel Model = new CircleModel();
		CircleView View = new CircleView();
		CircleController Controller = new CircleController(Model, View);
		
		Controller.run();
		
	}

}