package com.javaex.oop.methods;

public class MethodsEx {

	public static void main(String[] args) {
		
		// 입력 X, 출력 X method
		printMessage();
		
		// 입력 O, 출력 O
		double result = getSum(4, 1);
		System.out.println(result);
		
		// 입력 X, 출력 O
		// 입력 O, 출력 X
		
		System.out.println(getTotal(new double[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9
		}));
		
		System.out.println(getTotalVar(1,2,3,4,5,6,7,8,9));
		
		printTotal("합계", 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		
	}
	
	//고정인자 + 가변인자 -> 정의 순서 중요 : 고정인자 먼저 선언 -> 가변인자
	private static void printTotal(String message, double ... values ) {
		System.out.println(message + ":" + getTotal(values));
	}
	
	// 가변 인수를 이용한 다수 인수 전달
	private static double getTotalVar(double ... values) { //전달된 매개변수 개수 상관없이 전달 가능
//		double total = 0;
//		for(double value: values) {
//			total += value;
//		}
//		return total;
		return getTotal(values); //중복코드이므로 수정
	}
	
	// 배열로 매개 변수 전달
	private static double getTotal(double[] values) {
		double total = 0; //합산 결과 변수
		for(double value: values) {
			total += value;
		}
		
		return total;
	}
	
	private static double getSum(double num1, double num2) {
		// 매개변수의 개수는 제한이 없음
		// 결과 리턴시 메서드의 타입과 결과 데이터의 타입이 일치해햐 함.
		return num1 + num2;
	}
	
	private static void printMessage() {
		System.out.println("Hello Java");
	}
}
