import java.util.Scanner;
 public class Book {
	

	 int bookId;
	    String title;
	    String authorName;
	    double price;
	    Scanner sc=new Scanner(System.in); 
	    public void displayBookDetails() {
	    	System.out.println("enter the bookId");
	    	int bookId=sc.nextInt();
	        if (bookId != 0) {
	            System.out.println("Book ID: " + bookId);
	            System.out.println("Title: " + title);
	            System.out.println("Author: " + authorName);
	            System.out.println("Price: $" + price);
	        } else {
	            System.out.println("Sorry, this book is not available.");
	        }
	    }
 }


