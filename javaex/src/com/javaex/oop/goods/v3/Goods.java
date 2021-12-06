package com.javaex.oop.goods.v3;

// v3 : 생성자
// 객체의 초기화 담당, new와 함께 호출
public class Goods {

	// Field
	private String name;
	private int price;
	
	// 생성자
	// 생성자를 선언하지 않으면 java compiler가 기본 생성자를 끼워넣음
	// 생성자를 선언하면 컴파일러는 기본 생성자를 끼워넣지 않음.
	public Goods(String name, int price) {
		this.name = name; 
		//현재 인스턴스 name에 밖에서 전달받은 name argument를 전달
		this.price = price;
	}
	
	// 외부 접근 방식 노출
	// getter, setter 
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name; 
//		//현재 instance의 name 필드에 밖에서 전달된 name 값 세팅 
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
