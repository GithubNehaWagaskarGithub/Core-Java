package Abstraction;

import java.util.Scanner;

public class MainApp12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the option !!");
        System.out.println("1.Lenovo");
        System.out.println("2.HP");
        int ch=sc.nextInt();

        Laptop l1=null;
        Laptop l2=null;
        if(ch==1)
        {
            l1=new Lenovo();
            l1.getCompanyName("Lenovo");
            l1.getModelName("ThinkPad");
            l1.getRAM(8);
            l1.getPrice(40000);
        }
        else
        {
            l2=new HP();
            l2.getCompanyName("HP");
            l2.getModelName("NotePad");
            l2.getRAM(16);
            l2.getPrice(60000);
        }
    }
}
