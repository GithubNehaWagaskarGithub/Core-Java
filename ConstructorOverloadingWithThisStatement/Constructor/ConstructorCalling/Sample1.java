package ConstructorCalling;

public class Sample1 extends Demo1 {
    Sample1(int a)
    {
        super("Neha");
        System.out.println("Sample1 Constructor :"+a);
    }
    void show()
    {
        System.out.println("Show Method from Sample1");
    }
}
