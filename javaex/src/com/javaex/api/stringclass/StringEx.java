package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		
//		usefulMethods();
		stringBufferEx();
	}
	
	private static void stringBufferEx() {
		// 버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		// 문자열 추가 : append
		sb.append(" is pencil");
		System.out.println(sb);
		
		// 문자열 삽입 : insert
		sb.insert(7, " my");
		System.out.println(sb);
		
		// 문자열 치환 : replace
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		// 버퍼 사이즈 조정 : setLength
		sb.setLength(5);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("This").append(" is pencil").insert(7, " my").replace(7, 10, " your");
		String s = sb2.toString();   // 최종 문자열이 생성된다.
		System.out.println(sb2);
	}
	
	private static void usefulMethods() {
		// 유용한 메서드들
		String str = "Java Programming JavaScript Programming";
		
		System.out.println("str: " + str);
		System.out.println("Length: "+ str.length());   // property가 아니라 method다
		
		// 변환 관련 메서드
		System.out.println("Upper case: " + str.toUpperCase());   // 모두 대문자로 바꾼다.
		System.out.println("Lower case: " + str.toLowerCase());   // 모두 소문자로 바꾼다.
		
		// 검색 관련 메서드
		System.out.println("Index 5의 글자: " + str.charAt(5));    // 5번 인덱스의 값 찾음
		int index = str.indexOf("Java");      // Java의 index 찾기
		System.out.println("1번째 Java 인덱스: " + index);
		index = str.indexOf("Java", 5);        // index 5 이후의 Java
		System.out.println("2번째 Java index: " + index);
		index = str.indexOf("Java", 21);      // index 21 이후의 Java
		System.out.println("3번째 Java index: " + index );  // -1 : 찾을 수 없음
		
		System.out.println("마지막 Java index: " + str.lastIndexOf("Java"));   // index 17 Java
		
		// 문자열 추출
		System.out.println("substring(5): " + str.substring(5));
		System.out.println("substring(5, 16): " + str.substring(5, 16));  // 5~16 앞까지
		
		// 문자열 변경
		System.out.println("replace: " + str.replace("Programming", "Coding"));
		
		// 문자열은 변경되지 않는다.
		System.out.println("str: " + str);
		
		// 화이트 스페이스 제거
		String s2 = "               Hello               ";
		String s3 = "                  Java             ";
		
		System.out.println(s2.trim() + " " + s3.trim());
		
		// 문자열 분리 ㅡ 특정 문자를 기준으로 분리하고 싶다.
		String[] words = str.split(" ");   // 공백문자열 기준으로 문자열을 분리해서 words에 넣음
		for (String word : words) {
			System.out.println("Word: " + word);
		}
		
		// 문자열의 비교 : Unicode 의 비교
		// 결과 : 0이면 순서가 같다.
		// 음수 : 순서가 빠르다.
		// 양수 : 순서가 느리다.
		System.out.println("ABC".compareTo("ABD"));   // -1이 나옴. C가 D보다 빠름.
	}

}
