package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40};
        System.out.println("Enter a Index Value :");
        try
        {
            int ind=0;
            try{
                ind=sc.nextInt();          //This is for Nested Try-Catch Block
            }catch (InputMismatchException i)
            {
                System.out.println(i);
            }
            System.out.println("Value of specific index is :"+arr[ind]);
        }catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a);
        }
    }
}
