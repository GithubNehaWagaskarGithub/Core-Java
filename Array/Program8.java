package Array;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String []arr;
        arr=new String[5];
        for( int i=0;i<5;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Values are :" +arr[0]+" "+(arr[1])+" "+(arr[2])+" "+(arr[3])+" "+(arr[4]));
    }
}
