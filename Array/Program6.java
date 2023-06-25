package Array;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] arr;
        arr=new int[5];
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter a number :");
            arr[i]=sc.nextInt();
            System.out.println("values is :" +arr[i]);
        }
    }
}
