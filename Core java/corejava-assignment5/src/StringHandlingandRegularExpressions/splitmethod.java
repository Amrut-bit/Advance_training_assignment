package StringHandlingandRegularExpressions;

import java.util.Scanner;

public class splitmethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String expr;
        System.out.println("Enter your full name: ");
        expr = input.next();
        String [] result = expr.split("|");

        for(String word: result) {

        System.out.println(word);

        }
	}

}
