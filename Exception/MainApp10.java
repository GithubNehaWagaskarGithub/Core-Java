package Exception;

import java.util.Scanner;

public class MainApp10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("Enter a Index Value :");
        try
        {
            int ind=sc.nextInt();
            System.out.println("Value of the specific Index:"+arr[ind]);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
    }
}
