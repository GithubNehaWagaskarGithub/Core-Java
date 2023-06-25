package String;

public class Program8 {
    public static void main(String[] args) {
        String str1="Core Java";

        for(int i=0;i<=str1.length()-1;i++)
        {
            System.out.print(str1.charAt(i)+"  ");
        }
        System.out.println();
        for(int i=0;i<=str1.length()-1;i++)
        {
            System.out.println(str1.charAt(i));
        }
    }
}
