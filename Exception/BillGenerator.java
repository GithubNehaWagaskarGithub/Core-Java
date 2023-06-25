package Exception;

public class BillGenerator extends RuntimeException{
    public BillGenerator(String message)
    {
        super(message);
    }
}
