package Bank;

public class Account {
	protected int acno;
    protected float balance;
    
    public Account(int a, int b) {
        acno = a;
        balance = b;
    }
    
    public void withdraw(int w) {
        balance -= w;
    }
    
    public void deposit(int d) {
        balance += d;
    }
}
