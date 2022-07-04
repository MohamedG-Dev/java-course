package learning.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("India");
		queue.add("Pakistan");
		queue.add("Sri Lanka");
		queue.add("Bangladesh");
		queue.add("Afghanistan");
		queue.add("China");

		System.out.println(queue);
		
		System.out.println("Head of the queue is: " + queue.peek());
		
		queue.remove();
		System.out.println("Queue after removing the head of an element: " + queue);
		
		System.out.println("Head of the queue is: " + queue.peek());

		String head = queue.poll();
		System.out.println("removed head is: " + head);

		System.out.println("Queue after using the poll method: " + queue);
	}

}
