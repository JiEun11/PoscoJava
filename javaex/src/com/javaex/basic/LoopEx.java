package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forGugu();
//		continueEx();
//		breakEx();
		diceEx();
	}

	
	private static void diceEx() {
		// 주사위 10번 굴리기
		for(int i = 1; i <= 10; i++) {
			int dice = (int)(Math.random()*6) + 1 ; //정수 난수 생성
			System.out.println(dice + " ");
		}
		System.out.println();
	}
	
	private static void breakEx() {
		int num = 1;
		
		while(true) {  //얼마나 반복할 지 몰라서 무한루프
			if(num % 6 == 0 && num %14 == 0) break;  //조건을 만족하면 loop 종료
			num++;
		}
		System.out.println(num);
	}

	private static void continueEx() {
		for ( int i = 1; i <= 20 ; i++) {
			if(i%2==0 || i%3==0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	// for문 구구단
	private static void forGugu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요.");
		
		int dan = sc.nextInt();
		
		for(int num = 1; num < 10; num++) {
			System.out.println(dan + " * " + num + " = " + dan*num );
		}
		sc.close();
	}
	
	private static void doWhileEx() {
		// 최소 1번 반복 수행할 경우 : do While
		int total = 0; // 합산 변수
		int num = 0; // 사용자 입력 변수
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("숫자를 입력하세요.[0이면 종료]");
			num = sc.nextInt();
			total += num;
		} while (num != 0);
		System.out.println("총 합: "+ total);
		sc.close();
	}

	// 숫자를 입력받아 입력한 숫자(단)의 구구단을 출력하세요
	private static void whileGugu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 : 1 이상의 숫자를 입력하세요.");

		int dan = scanner.nextInt();
		int i = 1;

		// print message
		while (i <= 10) {

			// print gugudan
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		scanner.close();
	}

	private static void whileEx() {
		// 1 ~ 10 반복
		int num = 1;

		while (num <= 10) {
			System.out.println("I like JAVA" + num);

			// 반복 조건 변수를 적절히 조절
			num++;
		}
	}

}
