package com.javaex.basic;

public class Types {
	public static void main(String[] args) {
//		intLongEx();
//		floatDoubleEx();
//		charEx();
//		booleanEx();
//		promotionEx();
		castingEx();
	}

	// 명시적 형변환 (Casting)
	private static void castingEx() {
		// 표현 범위가 넓은 자료 -> 표현 범위가 좁은 자료
		// 명시적으로 변환 해줘야 함.
		float f = 123.456f;
		System.out.println(f);
		
		int i = (int) f;
		System.out.println(i);
		
		int i2 = 1234567890;
		System.out.println(Integer.toBinaryString(i2));
		
		short s = (short)i2;
		System.out.println(s);
		System.out.println(Integer.toBinaryString(s));
		
		//형 변환시 자료 유실이 일어날 수 있으므로 주의
	}
	
	// (암묵적)형변환 (Promotion)
	private static void promotionEx() {
		// 표현 범위 좁은 자료 -> 표현 범위 넓은 자료
		// compiler가 자동으로 변환시킴
		byte b = 25;  // 1byte integer
		System.out.println(b);
		
		short s = b; // 2byte integer
		
		int i = s; // 4byte integer
		System.out.println(i);
		
		float f = i; // 4byte real number
		System.out.println(f);
	}
	
	// boolean type
	private static void booleanEx() {
		boolean b1 = true; // 참
		boolean b2 = false; // 거짓

		System.out.println(b1);
		System.out.println(b2);

		boolean result;
		int var1 = 3;
		int var2 = 6;

		result = var1 < var2;
		System.out.println(var1 + " < " + var2 + " = " + result);
	}

	// 문자형 타입
	private static void charEx() {
		char ch1 = 'A';
		char ch2 = '한';

		System.out.println(ch1);
		System.out.println(ch2);

		// ch1 4글자 뒤
		System.out.println(ch1 + 4);
		System.out.println((char) (ch1 + 4));
	}

	// 실수형 타입
	private static void floatDoubleEx() {
		// float(4) < double(8:default)
		// 정밀도 포기, 표현범위 확대
		float floatVar = 3.14159f; // F or f 붙이기
		double doubleVar = 3.14159;

		floatVar = 0.1234567890123456789F;
		doubleVar = 0.1234567890123456789;

		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		System.out.println(0.1 * 3);

//		지수 표기법(e)
		floatVar = 3E-6F;
		System.out.println(floatVar);
	}

	// 정수형 타입
	public static void intLongEx() {
		// byte(1) < short(2) < int(4:default) < long(8)
		int intVar1; // 선언
		int intVar2; // 선언

		intVar1 = 2021;
//		intVar2 = 2022202220222022; out of range 

		System.out.println(intVar1);

		long longVar1 = 2021; // 선언 + 초기화
		long longVar2 = 2022202220222022L;

		// 2진수, 8진수, 16진수
		int bin, oct, hex;
		bin = 0b1101; // 2진수 : 0b
		oct = 072; // 8진수 : 0
		hex = 0xFF; // 16진수 : 0x

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
