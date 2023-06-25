package Array;

import java.util.Scanner;

public class Program15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int min=arr[0];

        for (int j=0;j< arr.length;j++)
        {
            if (min>arr[j])
            {
                min = arr[j];
            }
        }
        System.out.println("Minimum Number in Array is "+min);
    }
}
/*for (int j : arr) { ayush sir coding
        if (min > j) {
        min = j;
        }*/