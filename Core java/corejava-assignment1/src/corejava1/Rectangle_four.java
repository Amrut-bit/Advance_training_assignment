package corejava1;

public class Rectangle_four {
	private int length;
	private int breadth;

	public Rectangle_four() {
	}

	public Rectangle_four(int length, int breadth) {
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

	public void printPerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter: " + perimeter);
	}
}

