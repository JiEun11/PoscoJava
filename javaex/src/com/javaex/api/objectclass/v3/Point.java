package com.javaex.api.objectclass.v3;

// v3. 얕은 복제
// 객체의 필드 데이터를 단순 복제
// 객체 복제 위해서 : Cloneable 인터페이스를 구현해줘야 함.
public class Point implements Cloneable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point getClone() {
		//복제본
		Point clone = null;
		try {
			clone = (Point)clone(); 			
		} catch(CloneNotSupportedException e) {
			//복제 실패 시
			e.printStackTrace();
		}
		return clone;
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
	
	
	
	
}
