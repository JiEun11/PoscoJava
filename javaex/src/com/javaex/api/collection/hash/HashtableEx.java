package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		// 키-값 쌍으로 저장
		// 맵에 데이터 넣기
		map.put("Soccer", 11);
		map.put("Baseball", 9);
		map.put("ValleyBall", 6);
		System.out.println(map);
		// key는 HashSet : 키는 중복될 수 없고, 순서 없다.
		map.put("ValleyBall", 12);
		System.out.println(map);
		
		// 키 포함여부
		System.out.println("Soccer 키가 있는가? "+ map.containsKey("Soccer"));
		
		// 값 포함여부 
		System.out.println("값에 9가 있는가? " + map.containsValue(9));
		
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();  //key set으로부터 하나씩 끄집어낸다.
			System.out.printf("Key: %s ==> value %d%n" ,key, map.get(key));
		}
		
		// Map 비우기
		map.clear();
		System.out.println(map);
	}

}
