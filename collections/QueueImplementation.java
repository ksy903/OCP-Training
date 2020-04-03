package collections;

import java.util.*;

public class QueueImplementation {
	public static void main(String[] args) {
		Queue <Integer> queue = new ArrayDeque<>(); // ArrayDeque is "pure" double-ended queue - best queue to use.
		
		//Methods to memorize
		System.out.println(queue.offer(10)); // Same as add (adds to back of queue, except that it returns true or false if it was able to be added or not. 
		System.out.println(queue); // [10]
		System.out.println(queue.add(4)); // Adds element to back of queue, either returns true or throws an exception
		System.out.println(queue); // [10, 4]
		System.out.println(queue.peek()); // Returns next element to be removed, or else null if empty queue
		System.out.println(queue); // returns 10
		System.out.println(queue.poll()); // removes AND returns next element
		System.out.println(queue); // returns 10 list is [4]
		System.out.println(queue.poll());
		System.out.println(queue); // returns 4 list is []
		System.out.println(queue.peek());
		System.out.println(queue); // returns null
		
		System.out.println("-----------------------");
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10); // Push uses ArrayDeque like a stack adding to top/front
		System.out.println(stack); // [10]
		stack.push(4); // Push uses ArrayDeque like a stack adding to top/front
		System.out.println(stack); // [4, 10]
		System.out.println(stack.peek()); // returns the next value that would be removed from list, null returned if nothing found
		System.out.println(stack); // returns 4 [4, 10]
		System.out.println(stack.poll()); // removes and then returns the next value in the stack, null returned if nothing found
		System.out.println(stack); // returns 4 [10]
		System.out.println(stack.poll()); // removes and then returns the next value in the stack, null returned if nothing found
		System.out.println(stack); // returns 10 []
		System.out.println(stack.peek()); // removes and then returns the next value in the stack, null returned if nothing found
		System.out.println(stack); // returns null []
	}
}
