package Array;

import java.util.Scanner;

public class Program20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int [] arr=new int[5];
        int max1=arr[0];
        int max2=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
            if(arr[i]>max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }

        }
        System.out.println("Maximum Number in Array is :"+max1);
        System.out.println("Second Maximum Number in Array is :"+max2);
    }
}
