package TypeCasting;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Laptop");
        System.out.println("1.Lenovo");
        System.out.println("2.HP");
        System.out.println("3.Dell");
        int ch =sc.nextInt();
        Laptop l1=null;

        if(ch==1)
        {
            l1=new Lenovo();
            l1.displayInfo();
        }
        else if (ch==2)
        {
            l1=new HP();
            l1.displayInfo();
        }
        else if (ch==3)
        {
            l1=new Dell();
            l1.displayInfo();
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}
