package com.javaex.quiz01;

public class Quiz1 {
	
	public static void main(String[] args) {
		
//		---------------------------Q1---------------------------
		String phoneNumber = "010-1234-1234";
		System.out.println(phoneNumber);
		
//		---------------------------Q2---------------------------
		float interestRate = 0.031F;
		System.out.println(interestRate);
		
//		---------------------------Q3---------------------------		
		System.out.println("1" + "3");   //13
		System.out.println(true+"Java"); //trueJava
		System.out.println('A'+'B'); //131
		System.out.println('1'+2);   //51
		System.out.println('J'+"ava");  //Java
//		System.out.println(false + null);
		//The operator + is undefined for the argument type(s) boolean, null
		
//		---------------------------Q4---------------------------
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		byte b2 = (byte)i;   // int --> byte
		char ch2 = (char)b;  // byte --> char :명시적 형변환 필요없음.
		short s = (short)ch;  // char --> short
		float f = (float)l;   // long --> float
		int i2 = (int)ch;     // char --> int
	}
}
