package Exception;

import java.util.Scanner;

public class MainApp13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="ABCDE";
        System.out.println("Enter a character index :");
        try{
            int idx=sc.nextInt();
            System.out.println("Character at Specific index :"+str.charAt(idx));
        }catch (StringIndexOutOfBoundsException s)
        {
            System.out.println(s);
        }finally
        {
            sc.close();
            System.out.println("Finally Block");
        }
    }
}
