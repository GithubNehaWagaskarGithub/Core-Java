package Looping_Statements;

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a =sc.nextInt();
        System.out.println("Digits are :");
        while(a!=0)
        {
            int r=a%10;
            System.out.println(r); //System.out.print(r)
            a/=10;
        }
    }
}
