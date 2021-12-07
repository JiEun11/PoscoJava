package com.javaex.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {

//		arithExceiptionEx();
		throwExceptEx();
	}

	private static void throwExceptEx() {
		ThrowsExcept except = new ThrowsExcept();

		try {
			except.executeRuntimeException(); // unchecked error
			except.executeException(); // checked error : 반드시 예외 처리
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		// 사용자 정의 Exception 사용
		try {
			System.out.println(except.divide(100, 0));			
		}catch(CustomArithException e) {
			System.err.println(e.getMessage());
			// 예외상황 확인
			System.err.println("나누어지는 수: " + e.getNum1());
			System.err.println("나누는 수: "+ e.getNum2());
		}
		
		System.out.println("예외 처리 완료");
	}

	private static void arithExceiptionEx() {
		double result = 0; // 결과 변수
		int num; // scanner로부터 정수값을 입력받을 아이

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");

		try {
			// 예외 발생 가능 영역
			num = scanner.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) {
			System.err.println("정수로 해 주세요.");
		} catch (ArithmeticException e) {
			System.err.println("0으로 나눌 수 없어요.");
		} catch (Exception e) { // 모든 예외 처리 가능
			e.printStackTrace();
		} finally {
			System.out.println("예외 처리 종료."); // 예외 유무 관계 없이 가장 마지막에
			// 자원 정리작업에 많이 씀.
		}

		System.out.println(result);
		scanner.close();
	}

}
