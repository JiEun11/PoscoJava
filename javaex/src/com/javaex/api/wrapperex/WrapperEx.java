package com.javaex.api.wrapperex;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = new Integer(10); // deprecated
		Integer i2 = Integer.valueOf(10);

		Integer i3 = Integer.valueOf("10");

		// auto boxing
		// 10이라는 데이터가 자동 박싱되어서 Integer type에 할당된다.
		// Integer i4 = Integer.valueOf(10);을 javac가 대신 해준 것
		Integer i4 = 10;
		
		// auto unboxing
		// int value = i4.intValue(); 를 javc가 대신 해준 것
		Integer value = i4; 

		// 포장된 값의 비교
		System.out.println(i == i2); //Wrapper class도 객체다. 객체 주소의 비교 주의
		System.out.println(i.intValue() == i2.intValue());
		System.out.println(i.equals(i2));
	}

}
