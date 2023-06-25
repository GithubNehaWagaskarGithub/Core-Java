package ConstructorOverloadingWithThisStatement;

public class Program1 {
    Program1()
    {
        System.out.println("Constructor 1");
    }
    Program1(int a)
    {
        this();
        System.out.println("Constructor 2");
    }
    Program1(int b,int c)
    {
        this(10);
        System.out.println("Constructor 3");
    }
    Program1(double d)
    {
        this(20,30);
        System.out.println("Constructor 4");
    }
    Program1(char e)
    {
        this(10.20);
        System.out.println("Constructor 5");
    }
}
