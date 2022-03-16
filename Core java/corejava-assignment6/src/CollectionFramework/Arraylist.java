package CollectionFramework;

import java.util.Scanner;

public class Arraylist {
	public static String a[] = {"Ani", "Sam", "Joe","swamy","ambika"}; 
	public static int found =0;
	        
	    public static void main(String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.print("Enter a student name: ");
	    	String str= sc.nextLine();
	        for (int i=0; i < a.length; i++)
	        {
	            if(a[i].equals(str))
	            {
	            found++;
	            }
	}
	        if(found > 0)
	        {
	            System.out.println("The student " +str+ " is in the array");
	        }
	        else
	        {
	            System.out.println("The student " +str+ " is in the array");
	        }
	}
	}
	