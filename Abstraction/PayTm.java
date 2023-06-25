package Abstraction;

public class PayTm extends Theater{
    @Override
    public void bookTicket(int Qty)
    {
        int price=50;
        System.out.println("Book the ticket from PayTm :"+Qty+" Ticket for Rs :"+(Qty*price));
    }
}
