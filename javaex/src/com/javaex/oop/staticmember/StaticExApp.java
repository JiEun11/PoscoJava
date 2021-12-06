package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {

		StaticEx s1 = new StaticEx();
		// static 멤버는 new 없이 접근 가능
		System.out.println("RefCount : " + StaticEx.refCount);

		StaticEx s2 = new StaticEx();
		System.out.println("RefCount : " + StaticEx.refCount);

		s2 = null; // s2 해제
		System.out.println("s2 해제");
		System.out.println("RefCount: " + StaticEx.refCount);

		// 주의 : system garbage collector를 직접 호출하지는 말 것
		System.gc();
		try {
			Thread.sleep(3000);  // 3초 대기
			System.out.println("RefCount: " + StaticEx.refCount);
		} catch (Exception e) {

		}
	}

}
