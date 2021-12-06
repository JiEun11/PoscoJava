package com.javaex.oop.point.v4;

// v4 : 상속

public class Point {
	
	protected int x;
	protected int y;

//	// 기본생성자: 매개변수 없는 생성자
//	public Point() {
//		
//	}
	
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
	
	// method overriding
	// 매개변수 타입, 개수, 순서가 같은 이름의 메서드를 중복선언 할 수 있다.
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을 ", x,y);
		if(bDraw) {  //bDraw가 ==true(참이면)
			message += "그렸습니다.";
		}else {   //bDraw가 거짓이면
			message += "지웠습니다.";
		}
		System.out.println(message);
	}
}
