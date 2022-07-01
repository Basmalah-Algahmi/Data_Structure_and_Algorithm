
public class InsertDelete {

	public static void main(String[] args) {
		
		int[] intArray= {1,2,3,4,5};
		// First, we will have to create space for a new element.
		// We do that by shifting each element one index to the right.
		// This will firstly move the element at index 3, then 2, then 1, then finally 0.
		// We need to go backwards to avoid overwriting any elements.
		//notice how the start index is length-2
		for (int i = 3; i >= 0; i--) {
		    intArray[i + 1] = intArray[i];
		}

		// Now that we have created space for the new element,
		// we can insert it at the beginning.
		intArray[0] = 20;
		
		for (int num : intArray) {
		      System.out.println(num);
		 }
		
		
		//delete from array
		
		/*delete the end one
		 * from end, we need to create a variable of the number of elements we just want to print then
		 * use it in the for loop to print those, so we do not use nameOfArray.lenght()
		 */
		
		int length= intArray.length;
		//delete from the beg or middle, need to do shifting of that position 
		// Starting at index 1, we shift each element one position
		// to the left.
		for (int i = 1; i < length; i++) {
		    // Shift each element one position to the left
			intArray[i - 1] = intArray[i];
		}

		// Note that it's important to reduce the length of the array by 1.
		// Otherwise, we'll lose consistency of the size. This length
		// variable is the only thing controlling where new elements might
		// get added.
		length--;
		
		System.out.println("After deleting first element");
		//again use our defined "length" not intArray.length
		for (int i = 0; i < length; i++) {
		    System.out.println( intArray[i]);
		}
		
		//delete what in index #1 which is 2
		for (int i = 2; i < length; i++) {
		    // Shift each element one position to the left
			intArray[i - 1] = intArray[i];
		}
		length--;
		System.out.println("After deleting index#1 element");
		//again use our defined "length" not intArray.length
		for (int i = 0; i < length; i++) {
		    System.out.println( intArray[i]);
		}

	}

}
