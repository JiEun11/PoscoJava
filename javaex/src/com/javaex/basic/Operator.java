package com.javaex.basic;

public class Operator {

	public static void main(String[] args) {
//		arithOperEx();
//		prefixIncrEx();
//		postfixIncrEx();
//		logicalOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionalOperEx();
	}
	
	
	private static void conditionalOperEx(){
		int a = 10;
		// a가 짝수면 짝수라고 출력, 홀수면 홀수라고 출력
		System.out.println(a + " is a(n) " + (a%2==0 ? "even": "odd")+ " number.");
		
		int score = 85;
		String message;
		// score 가 90점 이상이면 Good, 50점 미만이면 Fail 출력, 아니면 Pass
		message = score >= 90 ? "Good" : score < 50? "Fail": "Pass" ;
		System.out.println(message);
	}
	
	// 비트 시프트
	private static void bitShiftOperEx() {
		int val = 1;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 3));
		
		val = 0b1000;
		System.out.println(Integer.toBinaryString(val >> 2)); // 2bit 우측 시프트 
		
		
	}
	// 비트 연산자
	private static void bitOperEx() {
		// 정수형 자료에서만 사용 가능, 비트 단위의 미세한 제어에 이용
		int b1 = 0b11011101;
		int mask = 0b10101010;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(mask));
		
		System.out.println(Integer.toBinaryString(b1 & mask)); //비트 논리곱
		System.out.println(Integer.toBinaryString(b1 | mask)); //비트 논리합
		System.out.println(Integer.toBinaryString(~b1)); //비트 논리부정
	}
	
	// 비교, 논리 연산자
	private static void logicalOperEx() {
		// 비교: >, =>, <, <=, ==(equal), != (not equal)
		// 논리: 논리곱(AND:&&), 논리합(OR:||), 논리부정(NOT: !)
		int a = 5;
		// a가 0 초과, 10 미만의 값?
		// 조건1: a > 0
		// 조건2: a < 10
		// 결과 : 조건 1 AND 조건2
		boolean b1 = a > 0;    //true
		boolean b2 = a < 10;   //true
		
		boolean r = b1 && b2;  //논리곱
		System.out.println("b1 && b2= " + r);
		
		// a가 10이하거나 10이상의 값?
		// 조건1: a<=0
		// 조건2: a>=10
		
		b1 = a <= 0;
		b2 = a >= 10;
		r = b1 || b2;
		System.out.println("b1 || b2= "+ r);
		
		// 논리 부정(NOT !)
		System.out.println("!r == " + !r);
	}
	
	// 후위 증감
	private static void postfixIncrEx() {
		int a = 7;
		int b = 0;
		b = a++;
		System.out.println("b: " + b);
		System.out.println("a: " + a);
	}
	
	// 전위 증감
	private static void prefixIncrEx() {
		int a = 7;
		int b = 0;
		b = ++a;
		System.out.println("b: " + b);
		System.out.println("a: " + a);
	}
	
	// 산술연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// 부호 연산자(+, -)
		System.out.println(-a);  // -1 * a
		
		// 산술 연산자(+, -, *, /, %)
		System.out.println(a/b);  // int / int -> int(나눗셈의 몫)
		System.out.println((float)a / (float)b);
		System.out.println(a % b);  // 정수 나눗셈의 나머지 
		
//		System.out.println(a / 0);  // int / 0 : error나옴
		System.out.println(7.0 / 0); // double / 0 = Infinity 나옴
		System.out.println(7.0 / 0 + 100);  //Infinity가 포함된 산술식 Infinity 나옴
		
		// 어떤 값이 Infinity인지 확인 
		System.out.println(Double.isInfinite(7.0 / 0));  // true 라고 나옴
		
		// 데이터가 NaN인지 확인
		System.out.println(0.0 / 0.0);
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println(Double.isNaN(7.0 / 0));
		
	}

}
