package AnonymousClass;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Bill :");
        int bill=sc.nextInt();
        if(bill>100)
        {
            System.out.println("Bill Is Generated");
        }
        else throw new RuntimeException("Bill is not Generated");

    }
}

