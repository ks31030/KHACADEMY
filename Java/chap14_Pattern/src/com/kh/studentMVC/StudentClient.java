package com.kh.studentMVC;

public class StudentClient {
	//�л����� �ٷ�� ��
	public static void main(String[] args) {
		//�𵨰�ü ���� Model
		StudentModel Model = new StudentModel("ȫ�浿", 25);
		//�� ��ü ���� View
		StudentView View = new StudentView();
		//��Ʈ�ѷ� ��ü ���� Controller(��, �� ����)
		StudentController Controller = new StudentController(Model, View); 
		//�л� ���� ������Ʈ�ؼ� ���
		Controller.updateView();
		//�л� ���� ������Ʈ ����
		Controller.setStudentName("�̱��");
		Controller.setStuduentAge(18);
		//������Ʈ �� �л� ���� ���
		Controller.updateView();
	}

}
