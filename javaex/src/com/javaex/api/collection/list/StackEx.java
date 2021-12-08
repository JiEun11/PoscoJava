package com.javaex.api.collection.list;

import java.util.Stack;

// Stack : Last Input First OUtput(LIFO : 후입선출)
public class StackEx {

	public static void main(String[] args) {
		// stack 선언
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=10; i++) {
			// push() to stack
			stack.push(i);
			System.out.println("Stack: " + stack);
		}
		
		// 가장 위 데이터를 확인 : peek()
		System.out.println("Peek: " + stack.peek());
		System.out.println("Stack: "+ stack);
		
		// 데이터의 인출 : pop()
		System.out.println("Pop: "+ stack.pop());
		System.out.println("Stack: " + stack);

		// 인출 전에 비어있나 check
		while(!stack.isEmpty()) {  // stack이 비어있지 않으면   
			System.out.println("Pop: " + stack.pop());
			System.out.println("Stack: " + stack);
		}
	}

}
