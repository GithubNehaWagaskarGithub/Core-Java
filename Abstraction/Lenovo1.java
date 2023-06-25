package Abstraction;

public class Lenovo1 implements Laptop1{

    @Override
    public void getCompanyName() {
        System.out.println("Company Name : Lenovo");
    }

    @Override
    public void getModelName() {
        System.out.println("Model Name : ThinkPad");
    }

    @Override
    public void getRAM() {
        System.out.println("RAM : 8GB");
    }

    @Override
    public void getPrice() {
        System.out.println("Price : 40000");
    }
}
