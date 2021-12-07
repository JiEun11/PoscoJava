package com.javaex.api.objectclass.v2;

// v2. equals : 객체 내부 비교
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		//객체 문자열 포맷을 반환
		return String.format("Point(%d, %d)",
				x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			//변환 
			Point other = (Point)obj; //둘다 포인트 객체라 내부 필드에 접근 가능
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	
	
}
