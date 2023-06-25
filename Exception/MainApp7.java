package Exception;

public class MainApp7 {
    public static void main(String[] args) {
        System.out.println("Program Starts");
        String s1=null;
        int [] arr={1,2,3,4};

        try{
            System.out.println(10/0);
            System.out.println(s1.length());
            System.out.println(arr[5]);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program Ends");
    }
}
