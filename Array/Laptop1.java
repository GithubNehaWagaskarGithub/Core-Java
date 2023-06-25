package Array;

public class Laptop1 {
    String company;
    int  srNo;
    double price;
    int RAM;

    public Laptop1(String company, int srNo, double price, int RAM) {
        this.company = company;
        this.srNo = srNo;
        this.price = price;
        this.RAM = RAM;
    }

    public void displayInfo()
    {
        System.out.println("Company :"+company);
        System.out.println("srNo :"+srNo);
        System.out.println("Price :"+price);
        System.out.println("RAM :"+RAM);
        System.out.println("------------------------------");
    }
}
