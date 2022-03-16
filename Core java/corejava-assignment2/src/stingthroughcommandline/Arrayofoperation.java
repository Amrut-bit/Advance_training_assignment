package stingthroughcommandline;

public class Arrayofoperation {

	public static void main(String[] args) {
		int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		
		int sum=0;
		int length=14;
		for (int i = 0; i < A.length; i++)
		{  
	           sum = sum + A[i];  
	     }  
	       
		 A[15]=sum;
		 
		System.out.println("Sum of 0 to 14 index elements of an array: " + A[15]); 
		
		double average =sum /A.length;
		A[16]=(int) average;
		System.out.println("average of elements " +A[16]);
		
		int min = A[0];  
          
        for (int i = 0; i < A.length; i++) {  
           
           if(A[i] <min)  
               min = A[i];  
        }  
        
        A[17]=min;
        System.out.println("Smallest element present in given array: " + A[17]);  
	}

}
