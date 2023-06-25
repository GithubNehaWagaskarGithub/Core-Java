package ConstructorCalling;

public class Central1 extends Sample1{
    Central1(double d)
    {
        super(10);
        System.out.println("Central1 Constructor :" +d);
    }
    void perform(String s)
    {
        System.out.println("Perform Method from Central1"+s);
    }
}
