package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
	/*
	 �̹��� �ϳ� �ҷ�����
	 ����ȭ�鿡 ���ο� ���� ����� mkdir
	 ���� ���������� �̹��� ����ȭ�鿡 ���� ���� ���� �ȿ� �����ϱ�
	 */
	//����ȭ�鿡 ���ο� ���� ����� mkdir
	String fp = "C:\\Users\\user1\\Desktop\\baby";
	File f = new File(fp);
	f.mkdir();
	
	String path = "C:\\Users\\user1\\Desktop\\baby\\";
	String inputImg = path + "cute.jpg";
	String outputImg = path + "reSizeCute.jpg";
	
	// ���������� �̹��� ũ�� ����
	int width = 10; //���� ����
	int height = 15; //���� ����
	
	try {
		//���� �̹����� �о����
		BufferedImage bufImg = ImageIO.read(new File(inputImg));
		
		//���ο� ũ��� �̹��� ��������
		Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		//BufferedImage ��ȯ
		BufferedImage bufResizeImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		
		//��������� �̹����� ���Ϸ� �����ϱ�
		ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
		
		System.out.println("�̹��� �������� �Ϸ�!");
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("�̹��� �������� �� ���� �߻� :" + e.getMessage());
		}
	}
}
