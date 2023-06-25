package TicketBooking;

public class TicketBook
{
    static int availableTicket =100;
    static double ticketPrice =50;

    public void bookTicket(int ticketCount)
    {
        if(ticketCount<availableTicket)
        {
            availableTicket -= ticketCount;
            System.out.println("Total ticket price :"+(ticketCount*ticketPrice));
        }
        else
        {
            System.out.println("Ticket not available !!");
        }
        System.out.println("-------------------------------");
        displayTicket();
    }
    public void cancelTicket(int ticketCount)
    {
        availableTicket += ticketCount;
        System.out.println("-------------------------------");
        displayTicket();
    }
    public void displayTicket()
    {
        System.out.println("Total ticket Count :"+availableTicket);
    }
}
