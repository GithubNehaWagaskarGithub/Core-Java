package String;

public class Program6 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";

        System.out.println("s1 address :"+ System.identityHashCode(s1));
        System.out.println("s2 address :"+ System.identityHashCode(s2));

        if (s1 == s2)
        {
            System.out.println("Both Strings are referencing Same Objects");
        }
        else if (s1.equals(s2))
        {
            System.out.println("Both Strings content are Same");
        }
        else
        {
            System.out.println("Both Strings are referencing Different Objects");
        }
    }
}