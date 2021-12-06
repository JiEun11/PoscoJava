package com.javaex.oop.point.v2;

// v2 : constructor

public class Point {
	
	private int x;
	private int y;

	// 기본생성자: 매개변수 없는 생성자
	public Point() {
		
	}
	
	// 전체 필드 초기화 생성자
	public Point(int x, int y) {
		this.x = x;
		//바깥으로부터 전달받은 argument를 내부에 setting
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("좌표[x=%d, y=%d]을 그렸습니다.%n",
				x, y);
	}
}
