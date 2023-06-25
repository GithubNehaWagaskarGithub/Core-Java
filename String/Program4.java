package String;

public class Program4 {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s6="Java";
        String s3=new String("Java");
        String s4=new String("JAVA");
        String s5=new String("Java");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);
        System.out.println(s4==s1);
        System.out.println(s3==s5);
        System.out.println(s5==s6);



        System.out.println("------------------------------");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s1));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

        System.out.println("------------------------------");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s4.equalsIgnoreCase(s1));
        System.out.println(s3.equalsIgnoreCase(s5));
        System.out.println(s5.equalsIgnoreCase(s6));

        System.out.println("------------------------------");

        System.out.println("s1 address :"+ System.identityHashCode(s1));
        System.out.println("s2 address :"+ System.identityHashCode(s2));
        System.out.println("s3 address :"+ System.identityHashCode(s3));
        System.out.println("s4 address :"+ System.identityHashCode(s4));
        System.out.println("s5 address :"+ System.identityHashCode(s5));
        System.out.println("s6 address :"+ System.identityHashCode(s6));


    }
}
