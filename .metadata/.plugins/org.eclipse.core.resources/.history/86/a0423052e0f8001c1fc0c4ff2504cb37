
package stackAndQueue;

import java.util.Stack;
/*
 * LIFO (last in, first out)
 */

class stack {
	
	// Main Method
	public static void main(String[] args)
	{

		// Default initialization of Stack
		Stack stack1 = new Stack();

		// Initialization of Stack
		// using Generics
		Stack <String> stack2 = new Stack <String>();

		// pushing the elements
		//keep adding to last
		stack1.push(4);
		stack1.push("All");
		stack1.push("Geeks");

		stack2.push("Geeks");
		stack2.push("For");
		stack2.push("Geeks");

		// Printing the Stack Elements
		System.out.println(stack1);
		System.out.println(stack2);
		
		//will take out from last in
		stack1.pop();
		System.out.println(stack1);
		
		
		stack1.push("This");
		stack1.push("is");
		stack1.push("Bella");
		
		
		System.out.println(stack1);  //[4, All, This, is, Bella]
		//It returns the position of the element from the top of the stack. Else, it returns -1.
		System.out.println(stack1.search("Bella"));	  //1
		System.out.println(stack1.search(4));	  //5
		
		
		//print last element
		System.out.println(stack1.peek());	
		
		System.out.println(stack1.empty());	  //return bool (true if empty)
		
		
	}
}

