package com.kh.thisSample;

public class ThisMain {
/*
 this ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü(=�ν��Ͻ�)�� �ּҰ� ����.
 this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴ� �� ���.
 */
	public static void main(String[] args) {
		int x = 10; //���� x�� 10�� �Ҵ�
		int y = x; //�������� y. x�� ����Ų��.

		x = 20;
		y = x;
		System.out.println("y : " + y);
		
		int[] list1 = {1, 2, 3};
		int[] list2 = list1; //list2�� ��������.
	}
	
	class MyClass{
		int myField;
		//ù��° ������
		MyClass(){
			this(0);//this() ����ؼ� �ٸ� ������ ȣ��
		}
		//�ι�° ������
		MyClass(int value){
			this.myField = value;
		}
		void printValue() {
			System.out.println("myField�� �� : " + this.myField);
		}
	}
	public class thisMain {
		public void main(String[] args) {
			MyClass obj1 = new MyClass();//ù��° ������ ȣ��
			MyClass obj2 = new MyClass(10);//�ι�° ������ ȣ��
			
			obj1.printValue();
			obj2.printValue();
			
		}
	}

}
