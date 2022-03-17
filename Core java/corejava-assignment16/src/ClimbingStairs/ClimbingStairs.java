package ClimbingStairs;

public class ClimbingStairs
{
  static int fib(int n)
  {
	  if(n<=1)
		  return n;
	  return fib(n-1) + fib(n-2);
  }
  
  static int ways(int stairs)
  {
	  return fib(stairs+1);
  }
	
	public static void main(String[] args) {
		int stairs=2;
		System.out.println("Number of ways to climb  "+ways(stairs));

	}

}
