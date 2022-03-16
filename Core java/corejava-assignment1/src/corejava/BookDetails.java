package corejava;

import java.util.Scanner;

public class BookDetails {

	 public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the Book name:");
	        String bookname=sc.nextLine();
	        
	        System.out.println("Enter the price:");
	        String price=sc.nextLine();
	        sc.nextLine();
	        
	        
	        
	        Book obj=new Book();
	        obj.setBookName(bookname);
	        obj.setBookPrice(price);
	    
	        System.out.println("Book Details");
	        System.out.println("Book Name :"+obj.getBookName());
	       
	        System.out.println("Book Price :"+obj.getBookPrice());
	        
	    }
}
