package com.javaex.basic;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayEx();
//		twoDimenEx();
//		arrayCopyFor();
		arrayCopySystem();
	}

	private static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		System.arraycopy(source,  //원본 배열
				0,   // 시작 인덱스 
				target,   // 복사 대상 배열
				0,  // 대상 배열 인덱스
				0); // 복사할 길이
		System.out.println("원본: " + Arrays.toString(source));
		System.out.println("복제: " + Arrays.toString(target));
	}
	
	private static void arrayCopyFor() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		for(int i = 0; i< source.length; i++) {
			target[i] = source[i];
		}
		System.out.println("원본: " + Arrays.toString(source));
		System.out.println("복제: " + Arrays.toString(target));
	}
	
	private static void twoDimenEx() {
		//2차원 배열
		int twoDimen[][] = new int[5][10]; //5행 10열 배열
		
		//기본 데이터가 있을 때
		int[][] table = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, //1행
				{2, 3, 4, 5, 6, 7, 8, 9, 0, 1}, //2행
				{3, 4, 5, 6, 7, 8, 9, 0, 1, 2}, //3행
				{4, 5, 6, 7, 8, 9, 0, 1, 2, 3}	//4행		
		};
		
		// 행배열 확인
		// 0 ~ table.length - 1 의 인덱스 범위
		System.out.println("table.length: " + table.length);
		
		//열 배열 확인:
		System.out.println("table[2].length: " + table[2].length);
		
		int sum = 0;
		for(int row = 0; row < table.length; row++) {  // 행루프
			for(int col = 0; col < table[row].length; col++) { //열루프
				System.out.print(table[row][col]+ " ");
				sum += table[row][col];
			}
			System.out.println();
		}
		System.out.println("요소의 합: " + sum);
	}
	
	private static void arrayEx() {
		// 배열의 선언
		String[] names; // Type[] 식별자
		int scores[]; // Type 식별자[]

		// 초기화
		names = new String[] { "김지수", "김지은", "배경욱", "김형민" };
		
		// 배열 생성 시 값 목록이 미리 있다면
		float height[] = {
				162.5f,
				166.5f,
				172.2f,
				165
		};
		scores = new int[4];
		System.out.println("배열의 길이: " + scores.length);
		
		// 인덱스 범위 : 0 ~ length -1 
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 85;
		scores[3] = 75;
//		scores[4] = 100; // Error! Index 4 out of bounds for length 4
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%s, %.2f, score = %d%n",names[i], height[i], scores[i]);
		}
		
		int[] scores2 = scores;
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores));
		
		scores2[2] = 100;
		
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
		
		System.out.println("scores == scores2: " + (scores == scores2));
		
	}
}
