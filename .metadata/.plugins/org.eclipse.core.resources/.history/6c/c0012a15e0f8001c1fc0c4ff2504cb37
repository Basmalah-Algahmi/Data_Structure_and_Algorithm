package linkedlist;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// create linkedlist
	    LinkedList<String> animals= new LinkedList<>();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    
		// add() method with the index parameter
	    animals.add(0, "Horse");
	    System.out.println("Updated LinkedList: " + animals);
	
	    
		// get the element from the linked list
	    String specificAnimal = animals.get(0);
	    System.out.println("Element at index 0: " + specificAnimal);
	    
	    // change elements at index 3
	    animals.set(1, "Coala");
	    System.out.println("Updated LinkedList: " + animals);
	    
	    // remove elements from index 1
	    String removedAnimal = animals.remove(1);
	    System.out.println("Removed Element: " + removedAnimal);

	    System.out.println("Updated LinkedList: " + animals);
	    
	    //check if list as an element
	    System.out.println(animals.contains("Coala"));
	    System.out.println(animals.contains("Horse"));
	    
	    //check index of an element
	    System.out.println(animals.lastIndexOf("Coala"));//-1 if not there
	    System.out.println(animals.lastIndexOf("Horse"));
	    
	    
	    //diff functions
	    
	   // System.out.println(animals.addFirst("Bird")); 	//adds the specified element at the beginning of the linked list
	   // System.out.println(animals.addLast("Bird")); //adds the specified element at the end of the linked list
	    System.out.println(animals.getFirst());	//returns the first element
	    System.out.println(animals.getLast());	//returns the last element
	    System.out.println(animals.removeFirst());	//removes the first element
	    System.out.println("Updated LinkedList: " + animals);
	    System.out.println(animals.removeLast());	//removes the last element
	    System.out.println("Updated LinkedList: " + animals);
	    System.out.println(animals.peek());	//returns the first element (head) of the linked list
	    animals.add("Horse");
	    System.out.println(animals.poll());//returns and removes the first element from the linked list
	    System.out.println("Updated LinkedList: " + animals);
	    System.out.println(animals.offer("Bird"));//adds the specified element at the end of the linked list
	    System.out.println("Updated LinkedList: " + animals);
  
	}

}



