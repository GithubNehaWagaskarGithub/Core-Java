package String;

import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        String str="HTML CSS JS REACT";
        //System.out.println("Enter A String :");
        //String str=new Scanner(System.in).next();
        String[] s1=str.split(" ");
        int[] len=new int[s1.length];

        for(int i=0;i< s1.length;i++)
        {
            len[i]=s1[i].length();
        }
        int max=0;
        String s2=null;
        for(int i=0;i< s1.length;i++)
        {
            if (len[i]>max)
            {
                max=len[i];
                s2=s1[i];
            }
        }
        System.out.println("String which is having max length :"+s2);
    }
}
