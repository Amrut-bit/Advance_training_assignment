package Bank;
public class Asignment4 {

	public static void main(String[] args) {
		Calculate calculate = new Calculate(123456789, 56000);
		calculate.accept(450, 670);
		
		calculate.compute();
		
		calculate.display();
		
	}

}
