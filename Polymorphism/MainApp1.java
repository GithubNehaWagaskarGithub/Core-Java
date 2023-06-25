package Polymorphism;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Program1 p1=new Program1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Options !!");
        System.out.println("1. Email Id");
        System.out.println("2. Phone Number");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter a Email Id");
            String emailId=sc.next();
            System.out.println("Enter a Password");
            int password=sc.nextInt();
            p1.login(emailId,password);
        }
        else if(ch==2)
        {
            System.out.println("Enter a Phone Number");
            int phNo=sc.nextInt();
            System.out.println("Enter a Password");
            int password=sc.nextInt();
            p1.login(phNo,password);
        }
        else
        {
            System.out.println("Invalid Choice");
        }
        //p1.login(1234567676,"Neha@123");
        //p1.login("nehawagaskar922516@gmail.com","Neha@123");
    }
}
