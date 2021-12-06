package com.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
		boolean a_q1 = a%2==0;
		System.out.println(a_q1);
		
		boolean b_q1 = b%3==0;
		System.out.println(b_q1);
		
		boolean r1 = a_q1 && b_q1;
		System.out.println("a_q1 && b_q1 = " + r1);
		
		System.out.println((int)c);
		System.out.println("A 4글자 뒤의 문자: " + (char)(c+4));
	}
}
