package stingthroughcommandline;
import java.util.Scanner;
public class commandline
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string");
        String name=sc.nextLine();
        
        int length = name.length();  
        System.out.println("The length of the String \""+name+"\" is: " +length);    
        
        System.out.println(name.toUpperCase());
        
       String reverseStr = "";
        
        for (int i = (length - 1); i >=0; --i) {
            reverseStr = reverseStr + name.charAt(i);
          }

          if (name.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(name + " is a Palindrome String.");
          }
          else {
            System.out.println(name + " is not a Palindrome String.");
          }
        
	}
}


