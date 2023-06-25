package Array;

public class Program25 {
    public static void main(String[] args) {
        Laptop l1=new Laptop(123,10000.00,8);
        Laptop l2=new Laptop(234,15000.00,8);
        Laptop l3=new Laptop(345,20000.00,8);
        Laptop l4=new Laptop(456,25000.00,8);
        Laptop l5=new Laptop(567,30000.00,8);

        l1.company="DELL";

        Laptop []arr={l1,l2,l3,l4,l5};

        for (int i=0;i<arr.length;i++)
        {
            arr[i].displayInfo();
            System.out.println("-------------------------------");
        }
    }
}
