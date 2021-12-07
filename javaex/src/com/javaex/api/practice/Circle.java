package com.javaex.api.practice;

import com.javaex.api.objectclass.v2.Point;

// 실습 예제 p.4
public class Circle {

	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			//변환
			Circle other = (Circle)obj; //둘다 포인트 객체라 내부 필드에 접근 가능
			return radius == other.radius;
		}
		return super.equals(obj);
	}
	
	
}
