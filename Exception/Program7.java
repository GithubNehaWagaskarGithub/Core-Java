package Exception;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40};
        System.out.println("Enter a index :");
        try{
           int idx=sc.nextInt();//this is for InputMismatchException
           System.out.println("Value of that specific index :"+arr[idx]);// this is for ArrayIndexOutOfBoundsException
       }catch(Exception a)
       {
           System.out.println("Catch Block");
           System.out.println(a);
           System.exit(0);                  // finally Block is not execute each and every situation
       }finally {                                 // if developer terminate our code in catch block then your finally
           System.out.println("Finally Block");   // block will not get execute.
       }
    }
}
