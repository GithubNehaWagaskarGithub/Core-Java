package Array;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int [] arr;
        arr=new int[5];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        System.out.println("Values is :"+ arr[0]);
        System.out.println("Values is :"+ arr[1]);
        System.out.println("Values is :"+ arr[2]);
        System.out.println("Values is :"+ arr[3]);
        System.out.println("Values is :"+ arr[4]);
    }
}
