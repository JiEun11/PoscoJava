package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);  
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
		Point p2 = new Point(30, 40); 
		// 전체필드 초기화 생성자 호출 
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint(10, 20, "RED");
		cp1.draw(true);
		
		// 다형성 : 부모타입으로 자식객체 참조
		Point cp2 = new ColorPoint(30,40,"GREEN");
		cp2.draw(true);
	}

}
