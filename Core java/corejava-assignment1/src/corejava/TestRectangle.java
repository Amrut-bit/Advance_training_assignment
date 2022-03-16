package corejava;

class Rectangle {
	private int length;
	private int breadth;
	public Rectangle() {
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void printData() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}

	public void printArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
	
}

public class TestRectangle {

	public static void main(String[] args) {
		
		// Create two objects of this class, r1 and r2. Show the output of both the
				// constructor sand all method of these two objects
				Rectangle r1 = new Rectangle();
				Rectangle r2 = new Rectangle(4, 4);
				r1.printData();
				r1.printArea();
				
				Rectangle r3 = new Rectangle(7, 4);
				r3.printArea();
				
				Rectangle r4 = new Rectangle(4, 8);
				r4.printArea();
				
				Rectangle r5 = new Rectangle(9, 4);
				r5.printArea();
				
				Rectangle r6 = new Rectangle(10, 7);
				r6.printArea();
				
	}

}
