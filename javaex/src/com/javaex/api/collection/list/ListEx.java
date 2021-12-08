package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		// List는 interface로 구성되어 있음
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		
		//객체 추가
		lst.add("Java");	//맨 뒤에 새 노드 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		// 객체 삽입
		lst.add(2, "C#");  //중간에 객체 삽입
		System.out.println(lst);
		
		// List는 중복 삽입을 허용한다.
		lst.add("Java");
		System.out.println(lst);
		// List 항목 수
		System.out.println("Size: " + lst.size());
		
		// 삭제
		lst.remove(2);	// 인덱스로 삭제
		lst.remove("Python");  	// 값으로 삭제
		System.out.println(lst);
		lst.remove("Java");  // 중복인 경우 앞 순위가 삭제된다. 
		System.out.println(lst);
		
		// List, Set의 경우 Iterator 사용
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {
			String item = it.next();   // 다음 요소를 가져온다.
			System.out.println(item);
		}
		
		// 비우기
		lst.clear();
		System.out.println(lst);
		
		
	}

}
