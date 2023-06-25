package TypeCasting;

public class MainApp6 {
    public static void main(String[] args)
    {
        /*Super1 s1=new Sub3();
        s1.m1();
        Sub3 s2=new Sub4();
        s2.m1();
        s2.m1(10);
        Sub4 s3=new Sub4();
        s3.m1();
        s3.m1(10);
        s3.m1(10,10);*/
        Super1 s2=new Sub3();
        Sub3 s3=(Sub3)s2;
        s3.m1(10);
        s3.m1();
    }
}
