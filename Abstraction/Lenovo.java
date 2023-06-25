package Abstraction;

public class Lenovo implements Laptop{
    @Override
    public void getCompanyName(String Cname) {
        System.out.println("Company Name:"+Cname);
    }

    @Override
    public void getModelName(String Mname) {
        System.out.println("Model is :"+Mname);
    }

    @Override
    public void getRAM(int r) {
        System.out.println("RAM is :"+r+"GB");
    }

    @Override
    public void getPrice(double p) {
        System.out.println("Price is :"+p+"Rs");
    }
}
