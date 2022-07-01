package stackAndQueue;
import java.util.LinkedList;
import java.util.Queue;

// Java program to demonstrate a Queue



public class queue_Linkedlist {

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
		Queue<String> names= new LinkedList<>();


		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 0; i < 5; i++)
			q.add(i);
		
		names.add("Bella");
		names.add("Dula");
		names.add("Ali");
		
		

		// Display contents of the queue.
		System.out.println("Elements of queue "+ q);
		System.out.println("Elements of queue "+ names);

		// To remove the head (removed from beg)of queue.
		int removedele = q.remove();
		String removedName=names.remove();
		System.out.println("removed element: "+ removedele);
		System.out.println("removed element: "+ removedName);

		System.out.println(q);
		System.out.println("Elements of queue "+ names);

		// To view the head of queue (peek is the first element of the list)
		int head = q.peek();
		System.out.println("head of queue:"+ head);
		System.out.println("head of name queue:"+ names.peek());

		// Rest all methods of collection
		// interface like size and contains
		// can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue:"+ size);
		System.out.println("Size of queue:"+ names.size());
	}
}
