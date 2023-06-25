package Abstraction;

public class HP1 implements Laptop1{

    @Override
    public void getCompanyName() {
        System.out.println("Company Name : HP");
    }

    @Override
    public void getModelName() {
        System.out.println("Model Name : NotePad");
    }

    @Override
    public void getRAM() {
        System.out.println("RAM : 16GB");
    }

    @Override
    public void getPrice() {
        System.out.println("Price : 60000");
    }
}
