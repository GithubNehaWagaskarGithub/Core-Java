package designPattern;

public class MainApp1 {
    public static void main(String[] args) {
        GoogleAccount g=GoogleAccount.createAccount();//we can not create a multiple object of that class all object are
        //GoogleAccount gg=GoogleAccount.createAccount();// referencing at the same memory address.
        System.out.println(g);
        //System.out.println(gg);
        g.googleDrive();
        g.gmail();
        g.youtube();
        //gg.googleDrive();
        //gg.youtube();gg.gmail();

    }
}
