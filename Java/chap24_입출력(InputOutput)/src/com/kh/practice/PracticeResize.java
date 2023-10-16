package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
	/*
	 이미지 하나 불러오기
	 바탕화면에 새로운 폴더 만들기 mkdir
	 새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더 안에 저장하기
	 */
	//바탕화면에 새로운 폴더 만들기 mkdir
	String fp = "C:\\Users\\user1\\Desktop\\baby";
	File f = new File(fp);
	f.mkdir();
	
	String path = "C:\\Users\\user1\\Desktop\\baby\\";
	String inputImg = path + "cute.jpg";
	String outputImg = path + "reSizeCute.jpg";
	
	// 리사이즈할 이미지 크기 설정
	int width = 10; //가로 길이
	int height = 15; //세로 길이
	
	try {
		//원본 이미지를 읽어오기
		BufferedImage bufImg = ImageIO.read(new File(inputImg));
		
		//새로운 크기로 이미지 리사이즈
		Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		//BufferedImage 변환
		BufferedImage bufResizeImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		
		//리사이즈된 이미지를 파일로 저장하기
		ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
		
		System.out.println("이미지 리사이즈 완료!");
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("이미지 리사이즈 중 오류 발생 :" + e.getMessage());
		}
	}
}
