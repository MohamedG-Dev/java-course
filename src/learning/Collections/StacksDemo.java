package learning.Collections;

import java.util.Stack;

public class StacksDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("America");
		stack.push("German");
		stack.push("Italy");
		stack.push("India");

		System.out.println("Stack: " + stack);

		String poppedElement = stack.pop();
		System.out.println("Popped Element is: " + poppedElement);

		System.out.println("Stack after using pop method: " + stack);

		System.out.println("the top most element of the stack is: " + stack.peek());

	}

}
