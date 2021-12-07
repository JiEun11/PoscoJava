package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable{

	protected double r; //반지름
	
	public Circle(int x, int y, double r) {
		super(x,y);   //super()생성자를 통해 x, y 좌표값 세팅
		this.r = r;  //반지름 나만 갖고 있는 거니까 세팅
	}
	
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%.2f을 그렸어요.%n", 
						x, y, r, area());
		
	}

	@Override
	public double area() {
		
		return Math.PI * Math.pow(r, 2);  // PI*R*R
	}

}
