package com.kh.genericsMain;

//���ʸ� Ŭ���� ����
//T Type�� ���� T��� �ְ� ���� �ڸ����� �־ ��.
public class Book<T> {
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
}
