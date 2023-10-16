package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
		pm.Practice4();
		pm.Practice5();
	}
	
	public void Practice1() {
		//������
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("������ : " + forDate);
	}
	public void Practice2() {
		//�ú���
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("�ú��� : " + forDate);
	}
	public void Practice3() {
		//����
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("���� : " + forDate);
	}
	public void Practice4() {
		//���� �ð�
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("���� : " + forDate);
	}
	public void Practice5() {
		//��¥ ����
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM:dd(E)");
		String forDate = sdf.format(currentDate);
		System.out.println("��¥ ���� : " + forDate);
	}
}
