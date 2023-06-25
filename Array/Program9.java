package Array;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] arr;
        arr=new int [5];
        for (int i=4;i>0;i--)
        {
            System.out.println("enter a number : ");
            arr[i]= sc.nextInt();
            System.out.println("Values are :" + arr[i]);
        }

    }
}
