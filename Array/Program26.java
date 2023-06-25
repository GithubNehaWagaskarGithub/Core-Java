package Array;

public class Program26
{
    public static void main(String[] args)
    {
        Laptop1[] arr=new Laptop1[5];

        arr[0] =new Laptop1("HP",123,10000.00,8);
        arr[1] =new Laptop1("DELL",234,15000.00,8);
        arr[2] =new Laptop1("LENOVO",345,20000.00,8);
        arr[3] =new Laptop1("APPLE",456,25000.00,8);
        arr[4] =new Laptop1("ASUS",567,30000.00,8);

        for (int i=0;i<arr.length;i++)
        {
            arr[i].displayInfo();
        }
    }
}
