package Exception;

import java.util.Scanner;

public class MainApp14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age :");
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Eligible for Voting");
        }
        else{
            throw new ArithmeticException();
        }
    }
}
