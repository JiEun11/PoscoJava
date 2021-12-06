package com.javaex.oop.goods.v4;

// v4 : this 
// this : 현재 instance 자신을 지칭
// this(): 현재 클래스 내부의 다른 생성자 호출 시 사용 
public class Goods {

	// Field
	private String name;
	private int price;
	
	// 1번째 생성자, 이름 필드만 입력받는 
	public Goods(String name) {
		this.name = name;
	}
	
	// 2번째 생성자, 이름&값 필드 입력받는
	public Goods(String name, int price) {
		this(name); //다른 생성자 호출 
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
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
