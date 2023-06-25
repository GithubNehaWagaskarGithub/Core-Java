package Abstraction;

import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Application");
        System.out.println("1.Private WhatsApp");
        System.out.println("2.Public WhatsApp");
        int ch= sc.nextInt();

        WhatsApp w1=null;
         if (ch==1)
         {
             w1=new PrivateWhatsApp();
         }
         else
         {
             w1=new PublicWhatsApp();
         }
         w1.sendMsg();
         w1.postStatus();
         w1.videoCall();
         w1.voiceCall();
    }
}
