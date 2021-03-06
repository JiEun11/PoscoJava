package com.javaex.basic;

public class StringEx {

	public static void main(String[] args) {
//		stringEx();
		stringFormatEx();
	}

	private static void stringFormatEx() {
		// %d(integer), %s(string), %f(실수데이터), %n(개행), %%(percent) ...
		String fruit = "사과";
		int total = 10;
		int ate = 3;
		System.out.println(total+"개의 " + fruit +" 중에서 " + ate +"개를 먹었다.");
		
		// 템플릿 문자열
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n", total, fruit, ate);
		
		// 현재 이자율은 1.2% 입니다.
		float rate = 1.2F;
		String str = String.format("현재 이자율은 %.2f%% 입니다.", rate); //f는 기본적으로 소수점 6자리 보여줌.
		
		System.out.println(str);
	}
	
	private static void stringEx() {
		String str1;	// 선언
		str1 = "Java";  // Literal -> JVM's String Pool이 관리
		
		String str2 = "Java";	// 선언&초기화, Literal -> JVM's String Pool이 관리
		String str3 = new String("Java");
		
		System.out.println("str1 == str2? " + (str1==str2));
		System.out.println("str1 == str3? " + (str1==str3));
		System.out.println("str2 == str3? " + (str2==str3));
		
		// 참조 객체의 경우, ==, !=은 객체의 메모리 주소의 동일성 확인 
		// 참조 객체의 값의 비교 : equals
		System.out.println("str1과 str3의 값이 같은가? " + str1.equals(str3));
	}

}
