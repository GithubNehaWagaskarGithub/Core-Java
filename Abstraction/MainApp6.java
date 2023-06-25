package Abstraction;

import java.util.Scanner;

public class MainApp6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.BookMyShow");
        System.out.println("2.PayTm");
        int ch=sc.nextInt();

        Theater t1=null;
        if (ch==1)
        {
            t1=new BookMyShow();
        }
        else if (ch==2)
        {
            t1=new PayTm();
        }
        else
        {
            System.out.println("Invalid Choice");
        }
        t1.bookTicket(5);
    }
}
