package designPattern;

public class GoogleAccount {
    static GoogleAccount g1;
    private static int count=0;

    private GoogleAccount()
    {
        System.out.println("Constructor");
        count++;
    }
    public static GoogleAccount createAccount()
    {
        if(count==0)
        {
            g1=new GoogleAccount();
        }
        return g1;
    }
    public void googleDrive()
    {
        System.out.println("Accessing Google Drive");
    }
    public void gmail()
    {
        System.out.println("Accessing Gmail");
    }
    public void youtube()
    {
        System.out.println("Accessing Youtube");
    }
}
