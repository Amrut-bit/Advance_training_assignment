package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;


class Product {  
String id;  
String name;  

public Product(String id, String name) 
{  
    this.id = id;  
    this.name = name;    
 }

public static boolean remove(String string) {
	// TODO Auto-generated method stub
	return false;
}  
}  
public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Product> set=new HashSet<Product>();  
	    //Creating Books  
	    Product p1=new Product("P001","MARUTI 800");  
	    Product p2=new Product("P002","MARUTI ZEN");  
	    Product p3=new Product("P003","MARUTI DEZIRE");  
	    Product p4= new Product("P004","MARUTI ALTO") ;
	    set.add(p1);  
	    set.add(p2);  
	    set.add(p3);
	    set.add(p4);
	    
	    set.remove("P004");  
        System.out.println("After invoking remove(object) method: "+set);
        
        System.out.println("Hash set Elements: "+ set);  
          
      System.out.println("Does the Set contains 'P002'? :- "+set.contains("P002")); 
	}

}
