package Abstraction;

public class Amazon implements AmazonPay,AmazonFresh{
    @Override
    public void payment()
    {
        System.out.println("Doing Payment");
    }

    @Override
    public void buyVegetable()
    {
        System.out.println("Buying Vegetables");
    }
}
