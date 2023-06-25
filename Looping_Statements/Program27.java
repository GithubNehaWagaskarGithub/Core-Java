package Looping_Statements;

import java.util.Scanner;

public class Program27 { //for reverse a number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int a=sc.nextInt();

        int sum=0;
        while(a!=0)
        {
            int r=a%10;
            sum=sum*10+r;
            a/=10;
        }
        System.out.println("sum :"+sum);
    }
}
