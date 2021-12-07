package com.javaex.api.practice;

// 실습 예제 p.4
public class CircleApp {

	public static void main(String[] args) {
		
		Circle a = new Circle(6,4,10);
		Circle b = new Circle(2,12,10);
		Circle c = new Circle(3,3,12);
		Circle d = c;
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
	}

}
