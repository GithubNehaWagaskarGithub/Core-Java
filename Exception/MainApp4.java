package Exception;

public class MainApp4 {
    public static void main(String[] args) {
        System.out.println("Program Start");
        String s1=null;
        try{
            System.out.println(s1.length());
        }catch (Exception e)//here we can perform a upcasting means we can create a reference of super class and
        {                    // object of sub class means Exception is super class and NullPointerException is sub class.
            System.out.println(e);
            System.out.println("Can't fetch the size of null String Value");
        }
        System.out.println("Program Ends");
    }
}
