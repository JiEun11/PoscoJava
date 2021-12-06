package com.javaex.oop.goods.v2;

// v2 : Access Modifier(접근제한자) 캡슐화
public class Goods {

	// Field
	private String name;
	private int price;
	
	
	// 외부 접근 방식 노출
	// getter, setter 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
		//현재 instance의 name 필드에 밖에서 전달된 name 값 세팅 
	}
	
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
