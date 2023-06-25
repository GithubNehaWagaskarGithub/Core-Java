package objectClass;

import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        String s1="neha";
        int a=10;
        String s2=new String("Java");
        Scanner sc=new Scanner(System.in);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(sc.getClass());

        System.out.println(s1.getClass().getSimpleName());
        System.out.println(s2.getClass().getSimpleName());
        System.out.println(sc.getClass().getSimpleName());
    }
}
