package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� �ν���Ʈ ����
		Student student1 = new Student("�輮", 20, "1�г�");
		// �л� ���� ���
		student1.displayInfo();

		/*�л��� 3�� ���� 3�� ����ϱ�*/
		Student student2 = new Student("��ö��", 20, "1�г�");
		student2.displayInfo();
		Student student3 = new Student("��μ�", 21, "2�г�");
		student3.displayInfo();
		Student student4 = new Student("�迵��", 22, "3�г�");
		student4.displayInfo();

	}

}
