package CollectionFramework;

public class contact
{
	private String firstName;
	private long  phoneNumber;
	  
	  public contact(){}
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String l) {
	    this.firstName = l;
	  }
	  
	  public long getPhoneNumber() {
	    return phoneNumber;
	  }
	  public void setPhoneNumber(long phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }
	 
	  public contact(String firstName, String lastName, long phoneNumber) {
	    super();
	    this.firstName = firstName;
	   
	    this.phoneNumber = phoneNumber;
	    
	  }
	}

