package com.kh.instance.tv;
//Tv 제작
public class Tv {
	
	//Tv 속성(필드)
	String color; //색상
	boolean power; //전원상태
	int channel; //채널
	
	//Tv 기능(메서드)
	public void power() {
		power = !power; //전원상태
	}
	
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
