package Array;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter a Number :");
        for (int i =0 ; i< arr.length ; i++)
        {
            arr[i] = new Scanner(System.in).nextInt();
        }
        int min = arr[0];
        for (int a: arr)
            if (min>a)
                min=a;

        System.out.println("Minimum number in Array is : " +min);
    }
}
