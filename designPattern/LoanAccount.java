package designPattern;

public class LoanAccount implements BankAccount{
    private double balance=0;
    public LoanAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public void deposit(double amt) {
        balance-=amt;
        System.out.println("---------------------");
        checkBalance();
    }
    @Override
    public void withdraw(double amt) {
        balance+=amt;
        System.out.println("---------------------");
        checkBalance();
    }
    @Override
    public void checkBalance() {
        System.out.println("Total Balance is :"+balance);
    }
}
