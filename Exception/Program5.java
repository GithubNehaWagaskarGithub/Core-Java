package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Program5 {
    public static void master() throws IOException
    {
        System.out.println("Master Method Starts");
        FileWriter fileWriter=new FileWriter("");
        System.out.println("Master Method Ends");
    }
    public static void central() throws IOException
    {
        System.out.println("Central Method starts");
        master();
        System.out.println("Central Method Ends");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Starts");
        try{
            central();
        }catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println("Main Method Ends");
    }
}
