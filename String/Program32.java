package String;

import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        String str=new Scanner(System.in).next();

        System.out.println("Enter a No of Parts of String do you want to Divided :");
        int no=new Scanner(System.in).nextInt();

        int len=str.length()/no;
        if(str.length()%no==0)
        {
            for(int i=0;i<str.length();i=i+len)
            {
                System.out.println(str.substring(i,i+len));
            }
        }
        else
        {
            System.out.println("String cant not divided into equal parts !!");
        }
    }
}
