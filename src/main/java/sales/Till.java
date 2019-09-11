package sales;

public class Till {
    private double balance;

    public Till(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void add(double amount){
        this.balance += amount;
    }
}
