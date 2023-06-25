package Array;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] subject;   //int[] subject=new int[5]
        subject = new int[5];
        System.out.println("Enter a Number:");
        for (int i = 0; i<5; i++)
        {
            subject[i] = sc.nextInt();
        }
        System.out.println("Marks are :");
        for (int i = 0; i < 5; i++) {
            System.out.print(subject[i]+ "    ");
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += subject[i];
        }
        System.out.println();
        System.out.println("Total Marks are :" + sum);
    }
}
