package CollectionFramework;
class Employee {
    private String id;
    private String name;
    private String address;
  
    public Employee(String id, String name, String address) { 
           this.id = id;
           this.name = name;
           this.address=address;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + ",address="+address+"]   ";
    }
    
}
 

class LinkedListEmptyException extends RuntimeException{
       public LinkedListEmptyException(){
         super();
       }
      
     public LinkedListEmptyException(String message){
         super(message);
       }  
}
class Node<T> {
    public T data;
    public Node<T> next; 
    public Node(T data){
           this.data = data;
    }
    public void displayNode() {
           System.out.print( data + " ");
    }
}
class LinkedList<T> {
    private Node<T> first; 
    public LinkedList(){
           first = null;
    }
 
    public void insertFirst(T data) {
           Node<T> newNode = new Node<T>(data);  
           newNode.next = first; 
           first = newNode;  
    }

    public Node<T> deleteFirst()
    {
           if(first==null){              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }
           Node<T> tempNode = first; 
           first = first.next; 
           return tempNode; 
    }

    public void displayLinkedList() {
           System.out.print("Displaying LinkedList [first--->last]: ");
           Node<T> tempDisplay = first; 
           while (tempDisplay != null){ 
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; 
           }
           System.out.println();
           
    }
 
}
 
public class linkedlist {
    public static void main(String[] args) {
           LinkedList<Employee> linkedList = new LinkedList<Employee>();          
           linkedList.insertFirst(new Employee("11", "sam","rnr"));
           linkedList.insertFirst(new Employee("21", "amy","bang"));
           linkedList.insertFirst(new Employee("59", "katy","delhi"));
           linkedList.insertFirst(new Employee("14", "sai","dvg"));
           linkedList.insertFirst(new Employee("39", "pat","usa"));
 
           linkedList.displayLinkedList(); 
                        
           System.out.print("Deleted Nodes: ");
           Node<Employee> deletedNode = linkedList.deleteFirst(); 
           deletedNode.displayNode();                               
           deletedNode = linkedList.deleteFirst();     
           deletedNode.displayNode();                                 
           
           System.out.println();
           linkedList.displayLinkedList(); 
    }
}
 