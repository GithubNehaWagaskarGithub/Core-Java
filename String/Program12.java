package String;

public class Program12 {
    public static void main(String[] args) {
        String s1="NitiN";
        String s2="";

        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        System.out.println("Reversed String :"+s2);
        if(s1.equals(s2))
        {
            System.out.println("String is Pallindrome");
        }
        else
        {
            System.out.println("String is not Pallindrome");
        }
    }
}