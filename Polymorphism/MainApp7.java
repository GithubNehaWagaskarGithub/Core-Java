package Polymorphism;

import java.util.Scanner;

public class MainApp7 {
    public static void main(String[] args) {
        Flipkart f1=new Flipkart(); //Flipkart f1=null; sir's coding
        Amazon a1=new Amazon();     //Amazon a1=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the Option :");
        System.out.println("1.FlipKart");
        System.out.println("2.Amazon");
        int ch=sc.nextInt();

        if(ch==1)                   //if(ch==1){
        {                           //   f1=new Flipkart();
            f1.sellProduct();       //   f1.sellProduct();  }
        } else if (ch==2) {         //else if(ch==2){
            a1.sellProduct();       //   a1=new Flipkart();
        }else {                     //   a1.sellProduct();  }
            System.out.println("Invalid Option");
        }
    }
}
