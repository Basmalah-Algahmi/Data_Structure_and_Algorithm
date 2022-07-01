

class declareAndInitialize 
{
	
	public static void main(String[] args) {
		
	   //static array, size is known in the compile time
	   char[] nameLetters= {'B','E','L','L','A'};
	   //if no need to know index, just read it this way
	   for (char letter : nameLetters) {
	        System.out.println(letter);
	    }
	   
	   int[] myNums= new int[3];
	   myNums[0]=10;
	   myNums[1]=20;
	   //myNums[2] will be garbage value as we did not intilize it
	   
	   for (int num : myNums) {
	       System.out.println(num);
	   }
	   
	   
	   //initialize values of array using for loop
	   System.out.println("Square Numbers");
	   int[] squareNumbers = new int[3];

		// Go through each of the Array indexes, from 0 to 9.
		for (int i = 0; i < 3; i++) {
		    // We need to be careful with the 0-indexing. The next square number
		    // is given by (i + 1) * (i + 1).
		    // Calculate it and insert it into the Array at index i.
		    int square = (i + 1) * (i + 1);
		    squareNumbers[i] = square;
		}
		//read array
	   for (int num : squareNumbers) {
	       System.out.println(num);
	   }
	   
		
	}

}

