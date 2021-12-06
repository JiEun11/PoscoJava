package com.javaex.quiz02;

public class Quiz02_2 {

	public static void main(String[] args) {
		int balls = 136; //보유하고 있는 공의 개수
		int cap = 10;   // 하나의 상자 당 담을 수 있는 공의 개수
		
		System.out.println(balls%cap==0? balls/cap+"개가 필요합니다." : balls/cap + 1 + "개가 필요합니다.");
		
		

	}

}
