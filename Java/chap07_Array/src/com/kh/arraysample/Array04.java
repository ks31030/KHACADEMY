package com.kh.arraysample;
  
public class Array04 {

	public static void main(String[] args) {
		// Array ����
		//                         0      1	      2      3      4
		String[] inturnArray = {"��泭","�踻��","ȫ�浿","��ö��","������"};
		
		inturnArray[3] = "���ѳ�";
		//System.out.println(inturnArray[3]);
		
		/*���� String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		������� �ٳ���
		���⿡�� ����
		Ű������ ����
		�޷п��� ��
		�ֿ��� ������
		*/
		
		String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		String[] fruitArray1 = {"���","����","Ű��","�޷�","��"};
		
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		
		System.out.println(fruitArray[0]);
		System.out.println(fruitArray[1]);
		System.out.println(fruitArray[2]);
		System.out.println(fruitArray[3]);
		System.out.println(fruitArray[4]);
		
		for (int i = 0; i < fruitArray.length; i++) {
			System.out.println(fruitArray1[i] + " ��� " + fruitArray[i]);
		}
	}

}
