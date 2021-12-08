package com.javaex.api.practice;

public class Rectangle {

	private int width;
	private int height;
	private int area;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		area = this.width * this.height;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			
		}
		return super.equals(obj);
	}
	
	
}
