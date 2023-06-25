package Abstraction;

public class MainApp3
{
    public static void main(String[] args)
    {
        Sample s1=new Sample();
        System.out.println(Demo.s1);
        System.out.println(s1.s2);
        s1.display();
        Demo.text();
        s1.show();

    }
}
