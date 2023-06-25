package Exception;

public class MainApp3 {
    public static void main(String[] args) {
        System.out.println("Program Start");
        try
        {
            int a=10/0;

        }catch (Exception e)
        {                           //here we can perform a upcasting means we can create a reference of super class and
            System.out.println(e);  // object of sub class means Exception is super class and NullPointerException is sub class.
            System.out.println("Can't divided by zero");
        }

        System.out.println("Program Ends");

    }
}
