package designPattern;

public class FactoryClass {
    public static BankAccount createAccount(int type,double amt)
    {
        BankAccount b1=null;
        if(type==1)
        {
            b1=new SavingAccount(amt);
        }
        else {
            b1=new LoanAccount(amt);
        }
        return b1;
    }
}
