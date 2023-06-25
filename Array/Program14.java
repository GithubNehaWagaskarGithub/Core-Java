package Array;

import java.util.Scanner;

public class Program14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max=arr[0];

        for(int j=0;j<arr.length;j++)
        {

            if(max<arr[j])
            {
                max=arr[j];
            }
        }
        System.out.println("Maximum Number in Array is :"+max);
    }
}
