package com.javaex.oop.point.v4;

// 상속과 Override
public class ColorPoint extends Point{

	private String color;
	
	// 생성자
	public ColorPoint(int x, int y, String color) {
		super(x,y);   //부모 생성자
		this.color = color;
	}
	
	@Override //컴파일러에게 이 메서드가 오버라이딩한 메서드인지를 확인
	public void draw(boolean bDraw) {
		//부모로부터 물려받은 메서드들
		// 덮어쓰기
		String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ", x,y,color);
		message += bDraw ? "그렸습니다." : "지웠습니다." ;
		
		System.out.println(message);
		
		// 부모의 메서드를 호출하려면
		super.draw(bDraw); //부모의 메서드가 호출된다.
	}
}
