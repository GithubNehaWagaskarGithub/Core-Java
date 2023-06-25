package Exception;

public class Program2 {
    public static void master()
    {
        System.out.println("Master Method Starts");
       try
       {
           System.out.println(10/0);
       }catch (Exception e)
       {
           System.out.println(e);
       }
        System.out.println("Master Method Ends");
    }
    public static void central()
    {
        System.out.println("Central Method Starts");
        master();
        System.out.println("Central Method Ends");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Starts");
        central();
        System.out.println("Main Method Ends");
    }
}
