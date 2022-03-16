package stingthroughcommandline;

import java.util.Scanner;

public class fibonacciserier {

	public static void main(String[] args) 
	{
      Scanner fs=new Scanner(System.in);
      int n = 13;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the n1 number");
     int n1=sc.nextInt();
      
      System.out.println("Enter the n2 number");
      int n2=sc.nextInt();
      
      System.out.println("Fibonacci Series till " + n + " terms:");

      for (int i = 1; i <= n; ++i) {
        System.out.print(n1 + ", ");

        int nextTerm = n1 + n2;
        n1 = n2;
        n2 = nextTerm;
      }  
		  

	}

}
