package Abstraction;

public class Dealer implements Product
{
    @Override
    public void getShop()
    {
        System.out.println("Shop Type is Electronics");
    }

    @Override
    public void getProduct()
    {
        System.out.println("Product is : TV");
    }
}
