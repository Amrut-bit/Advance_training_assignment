package Bank;
public class Calculate extends Account
{
    private int r;
    private int t;
    private float si;
    private float amt;
    
    public Calculate(int a, int b) {
        super(a, b);
    }
    
    public void accept(int x, int y) {
        r = x;
        t = y;
        amt = 0;
    }
    
    public void compute() {
        si = (balance * r * t) / 100.0f;
        amt = si + balance;
    }
    
    public void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + si);
        System.out.println("Amount: " + amt);
    }
}