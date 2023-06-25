package Looping_Statements;

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        do {
            System.out.println("Enter a Value:");
            a=sc.nextInt();
            System.out.println("A :" + a);
        }while(a>0);
    }
}
