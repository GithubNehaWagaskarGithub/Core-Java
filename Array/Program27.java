package Array;

public class Program27 {
    public static void main(String[] args) {
        Laptop3 l1=new Laptop3("HP",123,10000.00,8);
        Laptop3 l2=new Laptop3("DELL",234,15000.00,8);
        Laptop3 l3=new Laptop3("LENOVO",345,20000.00,8);
        Laptop3 l4=new Laptop3("APPLE",456,25000.00,8);
        Laptop3 l5=new Laptop3("ASUS",567,30000.00,8);

        Laptop3 []arr={l1,l2,l3,l4,l5};

        for (int i=0;i<arr.length;i++)
        {
            arr[i].displayInfo();
            System.out.println("-------------------------------");
        }
    }
}