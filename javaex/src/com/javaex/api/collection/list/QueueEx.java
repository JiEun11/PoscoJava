package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();

		// First Input First Output(FIFO: 선입선출)
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);	// enqueue
			System.out.println("Queue: " + queue);
		}
		
		// queue의 첫번째 데이터 확인
		System.out.println("Peek: " + queue.peek());
		System.out.println("Queue: " + queue);
		
		System.out.println("Poll: " + queue.poll()); //dequeue
		System.out.println("Queue: " + queue);
		
		while(!queue.isEmpty()) {
			System.out.println("Poll: " + queue.poll()); //dequeue
			System.out.println("Queue: " + queue);
			
		}
	}

}
