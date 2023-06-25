package Exception;

public class MainApp2 {
    public static void main(String[] args) {
        System.out.println("Program Start");
        String s1=null;
        try{
            System.out.println(s1.length());//Exception is occurred  here
        }catch (NullPointerException n)
        {
            System.out.println(n);
        }
        System.out.println("Program Ends");
    }
}
