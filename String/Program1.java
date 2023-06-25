package String;

public class Program1
{
    public static void main(String[] args)
    {
        String s1="java";
        String s2="java";
        //String s3="Java";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("s1 address :"+ System.identityHashCode(s1));
        System.out.println("s2 address :"+ System.identityHashCode(s2));
    }
}
