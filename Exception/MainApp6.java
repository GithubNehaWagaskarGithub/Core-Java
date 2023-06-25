package Exception;

public class MainApp6 {
    public static void main(String[] args) {
        System.out.println("Program Starts");
        int[] arr={1,2,3,4};
        try {
            System.out.println(arr[5]);//here we got a Exception for that we are put this statement inside a try block.
        }catch (ArrayIndexOutOfBoundsException e)   //catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program Ends");
    }
}
