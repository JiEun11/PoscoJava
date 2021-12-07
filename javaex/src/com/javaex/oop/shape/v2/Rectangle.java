package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	
	// 필드
	protected int width;
	protected int height;
	
	// 생성자
	public Rectangle(int x, int y, int width, int height) {
		//필드 x, y를 초기화 할 수 있는 애는 부모
		super(x,y); 
		
		this.width = width;
		this.height = height;
				
	}

	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%d, h=%d, area=%.2f]을 그렸습니다.%n",
				x,y,width,height,area());
		
	}

	@Override
	public double area() {
		return width * height;
		
	}

}
