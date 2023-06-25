package String;

import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        String str=new Scanner(System.in).next();
        String[] s1=str.split("_");
        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }
        System.out.println("==============================");
        for (int i=s1.length-1;i>=0;i--)
        {
            System.out.println(s1[i]);
        }
    }
}
