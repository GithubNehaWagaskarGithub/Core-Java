package Array;

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int [][] bank=new int[3][3];
        int maxsum=0;
        int sum=0;
        int customer=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                bank[i][j]=sc.nextInt();
                sum+=bank[i][j];
            }
            if(maxsum<sum)
            {
                maxsum=sum;
                customer=i;
            }
            sum=0;
        }
        System.out.println("Richest Person:"+maxsum);
        System.out.println("Customer :"+customer);
    }
}
