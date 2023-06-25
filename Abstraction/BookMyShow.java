package Abstraction;

public class BookMyShow extends Theater
{
    @Override
    public void bookTicket(int Qty)
    {
        int price=100;
        System.out.println("Book the ticket from BookMyShow :"+Qty+" Ticket for Rs :"+(Qty*price));
    }
}
