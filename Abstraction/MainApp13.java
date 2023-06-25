package Abstraction;

import java.util.Scanner;

public class MainApp13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Option !!");
        System.out.println("1.Lenovo");
        System.out.println("2.HP");
        int ch= sc.nextInt();

        Laptop1 l1=null;
        if(ch==1)
        {
            l1=new Lenovo1();
        }
        else
        {
            l1=new HP1();
        }
        l1.getCompanyName();
        l1.getModelName();
        l1.getRAM();
        l1.getPrice();
    }
}
