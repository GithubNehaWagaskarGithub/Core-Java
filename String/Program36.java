package String;

public class Program36 {
    public static void main(String[] args) {
        String str="Programming";
        System.out.println("Original String is :"+str);
        System.out.println();
        char[] s1=str.toCharArray();

        for (int i=0;i< s1.length;i++)
        {
            System.out.print(s1[i]);
        }
        System.out.println();

        for (int i=0;i< s1.length;i++)
        {
            System.out.println(s1[i]);
        }

    }
}