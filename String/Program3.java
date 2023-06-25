package String;
public class Program3
{
    public static void main(String[] args)
    {
        String s1=new String("java");
        String s2=new String("java");
        String s3=new String("JAVA");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("s1 address :"+ System.identityHashCode(s1));
        System.out.println("s2 address :"+ System.identityHashCode(s2));
        System.out.println("s3 address :"+ System.identityHashCode(s3));

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}