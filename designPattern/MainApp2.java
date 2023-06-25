package designPattern;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Account");
        System.out.println("1.Saving Account");
        System.out.println("2.Loan Account");
        int type=sc.nextInt();
        System.out.println("Enter a Amount");
        double amt=sc.nextDouble();

        BankAccount b1=FactoryClass.createAccount(type,amt);
        boolean status=true;

        do {
            System.out.println("Select Operation !!");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter amount to Deposit");
                amt = sc.nextDouble();
                b1.deposit(amt);
            } else if (ch == 2) {
                System.out.println("Enter amount to Withdraw");
                amt = sc.nextDouble();
                b1.withdraw(amt);
            } else if (ch == 3) {
                b1.checkBalance();
            } else {
                status = false;
            }

        }while (status);
    }
}
