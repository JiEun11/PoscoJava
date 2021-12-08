package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		
		IntBox iBox = new IntBox(); //내부데이터가 integer인 박스 설계
		iBox.setContent(10);
		System.out.println("IntBox: " + iBox.getContent());
		
		StrBox sBox = new StrBox();
		sBox.setContent("String box");
		System.out.println("StrBox: " + sBox.getContent());
		
		ObjBox oBox = new ObjBox();
		oBox.setContent(10);
		oBox.setContent("String oBox");

		String value = (String)oBox.getContent();
		System.out.println("content: " + value);
//		int iValue = (Integer)oBox.getContent();
		
		GenericBox<Integer> intGBox = new GenericBox<>();
		// 1. compiler에서 해당 데이터 타입 check 가능
		intGBox.setContent(10); 
		// 2. 다운캐스팅의 불편을 해소
		Integer iValue = intGBox.getContent();
		System.out.println("content: " + iValue);
		
		GenericBox<String> strGBox = new GenericBox<>();
		
	}

}
