package learning.Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("apple");
		linkedList.add("avacado");
		linkedList.add("banana");
		System.out.println(linkedList);

		linkedList.addFirst("fig");
		System.out.println(linkedList);

		linkedList.addLast("orange");
		System.out.println(linkedList);

		linkedList.add(2, "kiwi");
		System.out.println(linkedList);

		// removing elements from linked list
		linkedList.remove("banana");
		System.out.println(linkedList);

		linkedList.remove(2);
		System.out.println(linkedList);

		linkedList.removeFirst();
		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println(linkedList);
	}

}
