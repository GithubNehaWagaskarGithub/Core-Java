package Looping_Statements;

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        int temp=a;
        int sum=0;
        while(a>0)
        {
            int r=a%10;
            sum=sum*10+r;
            a/=10;
        }
        System.out.println("Reversed Number is :"+sum);
    }
}
