package Exception;

import java.util.Scanner;

public class MainApp15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Amount :");
        double amt=sc.nextDouble();
        if(amt>=100)
        {
            System.out.println("Bill is Generated Successfully !!");
        }
        else {
            throw new BillGenerator("We can't generator a Bill because Amount is too low !!");
        }
    }
}
