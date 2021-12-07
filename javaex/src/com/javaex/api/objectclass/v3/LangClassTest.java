package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point p = new Point(10, 10);
		
		
		System.out.println("p=: " + p);
		
		Point p2 = p.getClone();
		System.out.println("p2= " + p2);
		
		System.out.println("p == p2 ? " + (p == p2));
		
		p.setX(100);
		p.setY(200);  // p만 바꿨을 때 p, p2값 다르면 얕은 복제 성공
		
		System.out.println("p=: " + p);
		System.out.println("p2ㅓ=: " + p2);
	}

}
