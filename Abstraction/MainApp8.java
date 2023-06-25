package Abstraction;

import java.util.Scanner;

public class MainApp8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Employee");
        System.out.println("1.Tester");
        System.out.println("2.Developer");
        int ch=sc.nextInt();
        Employee e1=null;
        if (ch==1)
        {
            e1=new Tester();
        }
        else if(ch==2)
        {
            e1 = new Developer();
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        System.out.print("Enter the Salary :");
        double sal=sc.nextDouble();

        e1.getEmployeeType();
        e1.hikeSalary(sal);
    }
}
