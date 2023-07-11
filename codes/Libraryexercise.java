package codes;
import java.util.Scanner;
import java.util.*;


class library{
    Scanner sc = new Scanner(System.in);                                    //Scanner object

    public String[]bookarr(){                                               // array of books
        String []bookarray = {"Maths", "Physics", "Chemistry", "Biology", "Hindi", "English"};
        return bookarray;
    }
    public void showlibrary(){                                              //books present in library
        String []books = bookarr();
        System.out.println("--------------------------------------------------------");
        System.out.println("The list of books available in library");
        for (int i = 0; i <books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println("--------------------------------------------------------");
    }

    public void getbooks(){                                                 //get books
        String []books = bookarr();
        showlibrary();
        boolean found = false;
        System.out.println("Please Enter the book that you want to read");
        String input = sc.next();           // taking input form user
        for (int i = 0; i <books.length; i++) {
            String a = books[i];            // storing into a string
            if (Objects.equals(input, a)) {
                System.out.println("Here is your "+books[i]+" books,you have to return it within one month");
                found = true;
                break;
            }
        }
        if(found == false) {
            System.out.println("Sorry , this library do not have that book");
        }

    }
    public void returnbook(){                                       // return book
        System.out.println("Which book you have to return");
        String a = sc.next();
        System.out.println("You have return your "+a+" book, Thank you for learning new subject");
    }
	
		
}





public class Libraryexercise {
	public static void main(String[] args) {
		  System.out.println("\n           WELCOME TO THE LIBRARY          ");
	        library lib = new library();
	        lib.showlibrary();
	        lib.getbooks();
	        lib.returnbook();
	        System.out.println("STAY HUNGRY STAY FOOLISH");
		
	}

}
