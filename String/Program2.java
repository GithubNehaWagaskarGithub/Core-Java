package String;

public class Program2
{
    public static void main(String[] args)
    {
        String s1="java";
        String s2="java";
        String s3="JAVA";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("s1 address :"+ System.identityHashCode(s1));
        System.out.println("s1 address :"+ System.identityHashCode(s1));
        System.out.println("s3 address :"+ System.identityHashCode(s3));

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}