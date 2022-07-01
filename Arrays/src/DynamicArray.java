/*
 * Why do we need dynamic array?
   A dynamic array is an array with a big improvement: automatic resizing. 
   One limitation of arrays is that they're fixed size, meaning you need to specify the number of
   elements your array will hold ahead of time. A dynamic array expands as you add more elements. 
   So you don't need to determine the size ahead of time.
 * https://www.geeksforgeeks.org/creating-a-dynamic-array-in-java/
 */
//Java Program to Create a Dynamic Array

//Class 1
class Array {

	// Member variables of this class
	// Private access modifier
	private int arr[];
	private int count; //is zero

	// Note they can only be called through function

	// to compute length of an array
	/*this is the constructor, take in the length of the array that was declare, then will see if need to 
	  create a new array with a different size
	*/
	public Array(int length) { arr = new int[length]; }

	//insert elements to our array
	public void insert(int element)
	{

		if (arr.length == count) {

			// Creating a new array double the size
			// of array declared above
			int newArr[] = new int[2 * count];

			// Iterating over new array using for loop
			//copy the old array to the new one
			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}

			// Assigning new array to original array
			// created above
			//change to new address
			arr = newArr;
			//System.out.print(arr);
			
			System.out.println("Size of new array is "+arr.length+'\n');

		}
		
		//add element to array
		arr[count++] = element;
		//System.out.print(count)
		
		}
	
	// To print array
	public void printArray()
	{

		// Iterating over array using for loop
		for (int i = 0; i < count; i++) {

			// Print the elements of an array
			System.out.print(arr[i] + " ");
		}
	}
}

//Class 2
//Main class
public class DynamicArray {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of Array(user-defined) class
		//note this is not an array, it is just a variable, the array will be created in the class constructor
		Array numbers = new Array(3);

		// Adding elements more than size specified above
		// to the array to illustrate dynamic nature
		// using the insert() method

		// Custom input elements
		numbers.insert(10);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);

		// Calling the printArray() method to print
		// new array been dynamically created
		numbers.printArray();
	}
}
