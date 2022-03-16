package StringHandlingandRegularExpressions;

public class Manipulate {

	public static void main(String[] args)
	{
		
		String str="JAVA is Simple";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		char r1 = str.charAt(0);
		char r2 = str.charAt(5);
		char r3 = str.charAt(6);
		System.out.print(r1);
		System.out.print(" "+r2);
		System.out.println(" " +r3);
		
		for (String retval: str.split("JAVA is")) {
	         System.out.print(retval);
	      }
		String a="is";
		System.out.print(" " +a);
		for (String retval1: str.split("is Simple")) {
			System.out.println(" "+retval1);
	      }
		
		StringBuilder sb = new StringBuilder("JAVA is Simple");   
        System.out.println( sb.reverse());
        
        System.out.println(str.length());
	}

}
