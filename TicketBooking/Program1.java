package TicketBooking;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBook t1 = new TicketBook();

        System.out.println("1.Book Ticket");
        System.out.println("2.Cancel Ticket");
        System.out.println("3.Available Ticket");
        System.out.println();
        System.out.println("Select a Options:");
        int ch = sc.nextInt();

        if (ch == 1)
        {
            System.out.println("Enter Ticket Count:");
            int count = sc.nextInt();
            t1.bookTicket(count);
        }
        else if (ch == 2)
        {
            System.out.println("Enter Ticket Count:");
            int count = sc.nextInt();
            t1.cancelTicket(count);
        }
        else if (ch == 3)
        {
            t1.displayTicket();
        }
        else
        {
            System.out.println("Invalid Choice!!");
        }
    }
}