package TypeCasting;

public class MainApp5
{
    public static void main(String[] args)
    {
        Super s1=new Sub1();
        s1.m1();
        Sub1 s2=new Sub2();
        s2.m1(10);
        Sub2 s3=new Sub2();
        s3.m1(10,10);
        s3.m1(10);
        s3.m1();
    }
}
