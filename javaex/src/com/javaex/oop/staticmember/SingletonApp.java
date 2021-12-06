package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		//객체 인스턴스 얻어오기
		Singleton s2 = Singleton.getInstance();
		
		//s1과 s2가 같은 인스턴스 가리키는지 확인, 
		// 둘 다 참조객체이기 때문에 메모리가 같은지 확인
		// 객체 주소가 같으면 같은 객체다.
		System.out.println("s1, s2 같은 객체? "+
					(s1==s2));
		
	}

}
