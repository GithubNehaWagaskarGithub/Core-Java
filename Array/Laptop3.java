package Array;
public class Laptop3
{
    String company;
    int srNo;
    double price;
    int  RAM;

    Laptop3(String c1,int s1,double p1,int r1)
    {
        company=c1;
        srNo=s1;
        price= p1;
        RAM=r1;
    }
    public void displayInfo()
    {
        System.out.println("Company :"+company);
        System.out.println("srNo :"+ srNo);
        System.out.println("Price :"+ price);
        System.out.println("RAM :"+ RAM);
    }

}
