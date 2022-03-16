package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	private static final List<contact> Phone = null;
	private List<contact> PhoneBook=new ArrayList<contact>();
   
    public contact viewContactGivenPhone(long phoneNumber)
    {
        contact obj=new contact();
        for(contact obj1:Phone)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
    }
   
}