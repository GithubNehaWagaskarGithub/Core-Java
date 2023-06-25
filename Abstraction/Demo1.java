package Abstraction;

public interface Demo1
{
    String s1="Non-Static Data Member";
    static String s2="Static Data Member";
    public static void text()
    {
        System.out.println("Text Method");
    }
    public abstract void display();
}
