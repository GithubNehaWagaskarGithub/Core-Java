package objectClass;

public class MainApp3 {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3="Java";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        if(s1.hashCode()==s2.hashCode())
        {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
        System.out.println(s1.equals(s2));
        System.out.println();

        if(s2.hashCode()==s3.hashCode())
        {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
        System.out.println(s2.equals(s3));
    }
}
