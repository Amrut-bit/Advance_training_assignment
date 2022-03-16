package corejava;

import java.util.Scanner;

public class evenoddnumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter the number = ");  
		int n= sc.nextInt(); 

		System.out.print("Even Numbers from 1 to "+n+" are: ");

		for (int i = 1; i <= n; i++) {

		   if (i % 2 == 0) {

		 System.out.print(i + " ");

		   }

		}
	}

}
