package Exception;

import java.util.Scanner;

public class MainApp11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Age :");
        int age= sc.nextInt();
        if(age>18)
        {
            System.out.println("Eligible for voting !!");
        }
        else throw new RuntimeException("Not Eligible For Voting");

    }
}
