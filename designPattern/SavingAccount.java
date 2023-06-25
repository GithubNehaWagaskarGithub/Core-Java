package designPattern;

public class SavingAccount implements BankAccount {
    private double balance=0;
    public SavingAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println("-------------------");
        checkBalance();
    }
    @Override
    public void withdraw(double amt) {
        balance-=amt;
        System.out.println("-------------------");
        checkBalance();
    }
    @Override
    public void checkBalance() {
        System.out.println("Total Balance is :"+balance);
    }
}
