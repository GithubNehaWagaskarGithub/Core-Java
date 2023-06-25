package Array;

import java.util.Scanner;

public class Program20_
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int [] arr=new int[5];
        int min1=arr[0];
        int min2=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
            if(arr[i]<min1) {
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }

        }
        System.out.println("Maximum Number in Array is :"+min1);
        System.out.println("Second Maximum Number in Array is :"+min2);
    }
}
