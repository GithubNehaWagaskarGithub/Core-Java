package ConstructorChaining;

public class College extends University{
    public College(String uni,String col)
    {
        super(uni);
        System.out.println("College Name :"+col);
    }
}
