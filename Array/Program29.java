package Array;

import java.util.Scanner;

public class Program29
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array element");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Search a number");
            int a = sc.nextInt();
            if (a == arr[i]) {
                System.out.println("Element is found");
            } else {
                System.out.println("Element is not found");
            }
        }

    }
}