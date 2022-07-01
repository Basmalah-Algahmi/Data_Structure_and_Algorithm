
/*
 * tables/matrix
 * C++:     https://www.cs.cmu.edu/~mrmiller/15-110/Handouts/arrays2D.pdf
 * Java:    https://www.programiz.com/java-programming/multidimensional-array
 * 
 */
public class TwoDArray {

	public static void main(String[] args) {
		
		
		//table of 3 rows and 4 columns
		//Way#1
		int[][] numsMatrix = new int[3][4];
		//need to use 2 for loop to initialize the values
		int n=0;
		//acccess each row
		for (int i=0; i<3; i++) 
		{
			//access each column within that row
			for(int j=0; j<4; j++) {
				numsMatrix[i][j]=n;
				n++;
			}
			
		}
		//read 2d array
		for (int i = 0; i < numsMatrix.length; ++i) {
	          for(int j = 0; j < numsMatrix[i].length; ++j) {
	              System.out.print(numsMatrix[i][j]+" ");
	          }
	          System.out.println();
	     }
		
		//Way#2 of initialize 
		//not specify will have garbage values
		int[][] a = {
			      {1, 2, 3}, 
			      {4, 5, 6, 9}, 
			      {7}, 
		};
		
	    // calculate the length of each row_ return how many exist(defined)elements in each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
		
	
	

}
