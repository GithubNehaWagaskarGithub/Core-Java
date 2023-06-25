package String;

public class Program40 {
    public static void main(String[] args) {
        String str="this is core java batch";
        String[] s1=str.split(" ");
        for (int i=0;i< s1.length;i++)
        {
            String str1=s1[i];
            String temp=str1.toUpperCase();
            System.out.println(str1.substring(0, str1.length()-1)+temp.charAt(str1.length()-1));
        }
        for(String s:s1)
        {
            String temp=s.toUpperCase();
            System.out.println(s.substring(0, temp.length()-1)+temp.charAt(temp.length()-1));
        }
    }
}
