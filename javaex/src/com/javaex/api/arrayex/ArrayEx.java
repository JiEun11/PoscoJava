package com.javaex.api.arrayex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayEx {
	
	public static void main(String[] args) {
//		arrayCopyEx();
//		basicSortEx();
//		basicSortDescEx();
//		customClassSort();
		basicSearch();
	}
	
	private static void basicSearch() {
		int[] scores = {80, 50, 70, 90, 75, 88, 77 };
		// 이진검색 알고리즘은 검색 이전에 미리 정렬이 되어 있어야
		Arrays.sort(scores);
		System.out.println("원본배열: " + Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 75);
		System.out.println("75의 인덱스: " + index);
	}
	
	private static void customClassSort() {
		Member[] members = {
					new Member("홍길동"),
					new Member("고길동"),
					new Member("장길산"),
					new Member("임꺽정")
		};
		System.out.println("원본: "+ Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬: " + Arrays.toString(members));
//		Arrays.sort(members, Collections.reverseOrder());
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {	
				return o1.name.compareTo(o2.name);   
				// return 0 : 순번이 같다.
			}
		});
		System.out.println("역순 정렬: "+Arrays.toString(members));
	}
	
	// 내림차순 정렬
	private static void basicSortDescEx() {
		Integer[] scores = {80, 50, 70, 90, 75, 88, 77 };
		System.out.println("원본: "+ Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());   //정렬
		System.out.println("정렬: " + Arrays.toString(scores));
	}
	
	// 정렬 
	private static void basicSortEx() { 
		int[] scores = {80, 50, 70, 90, 75, 88, 77 };
		System.out.println("원본: "+ Arrays.toString(scores));
		Arrays.sort(scores);   //정렬
		System.out.println("정렬: " + Arrays.toString(scores));
	}
	
	private static void arrayCopyEx() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		
		//System 이용 복사
		int[] target = new int[arr.length];
		System.arraycopy(arr,     //원본 배열
						0, 		  // 시작인덱스
						target,   //대상 배열
						0,  	  //시작 인덱스
						arr.length);       //복사할 길이
		
		System.out.println("원본배열: " + Arrays.toString(arr));
		System.out.println("System 복제:" + Arrays.toString(target));
		
		// Arrays의 복제 메서드
		target = Arrays.copyOf(arr, // 원본 배열  
								arr.length);  // 복사할 길이
		System.out.println("copyOf: "+ Arrays.toString(target));
		
		// 배열의 일부 복제
		target = Arrays.copyOfRange(arr,   // 원본 배열  
									1,     // 복사 시작 위치 
				 					3);    // 복사할 끝 인덱스
		
		System.out.println("copyOfRange: " + Arrays.toString(target));
				
	}
}
