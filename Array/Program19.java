package Array;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character :");
        char [] arr=new char[5];
        char min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.next().charAt(0);
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Character is :"+min);
    }
}
