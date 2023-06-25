package Exception;

public class MainApp8
{
    public static void main(String[] args)
    {
        String str="123456ab";
        int a=0;
        try
        {
            a=Integer.parseInt(str);
        }
        catch (NumberFormatException n)
        {
            System.out.println(n);
        }
        System.out.println(a);
    }
}
