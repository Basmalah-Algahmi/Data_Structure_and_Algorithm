
// A simple definition for a DVD.
class DVD {
    public String name;
    public int releaseYear;
    public String director;

    //constructor
    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    //function print
    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

public class arrayOfObjects {

	public static void main(String[] args) {
	 //array of objects
	   DVD[] dvdCollection = new DVD[3];
	   dvdCollection[0] = new DVD ("Movie0",1990,"director0");
	   dvdCollection[1] = new DVD ("Movie1",2000,"director1");
	   
	   //or do it this way
	   DVD myFavMovie=new DVD ("Lion",2016,"director3");
	   dvdCollection[2]=myFavMovie;
	   
	   for (DVD dvd : dvdCollection) {
	       System.out.println(dvd.toString());
	   }

	}

}
