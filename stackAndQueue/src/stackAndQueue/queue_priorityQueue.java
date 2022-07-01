package stackAndQueue;
import java.util.LinkedList;
import java.util.*;

public class queue_priorityQueue {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Ali");
		
		
		System.out.println(pq);
		
		 Iterator iterator = pq.iterator();
		 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
       
	}
}

