package CollectionFramework;

import java.util.Scanner;

public class Phone
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int i=0;
        Phone objmain=new Phone();
        while(i==0)
        {
            System.out.println("Menu\n1.Add Contact\n2.Search contact by phone\n3.Exit");
            System.out.println("Enter your choice: ");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1)
            {
                contact obj=new contact();
                System.out.println("Add a contact: ");
                System.out.println("Enter the First Name: ");
                obj.setFirstName(sc.nextLine());
                System.out.println("Enter the Phone No. : ");
                obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
               
            }	
            if(n==2)
            {
                System.out.println("Enter the Phone number to search contact:");
                Long n1=Long.parseLong(sc.nextLine());
                contact obj1=objmain.viewContactGivenPhone(n1);
                System.out.println("The contact is:");
                System.out.println("First Name:"+obj1.getFirstName());
                System.out.println("Phone No.:"+obj1.getPhoneNumber());
                
            }
            if(n==5)
            {
                System.exit(0);
            }

		
	}
}

	private contact viewContactGivenPhone(Long n1) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

