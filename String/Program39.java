package String;

public class Program39 {
    public static void main(String[] args) {
        String str="this is core java batch";
        String revStr="";
        String[] s1=str.split(" ");
        for(int i= s1.length-1;i>=0;i--)
        {
            String str1=s1[i];
            String temp=str1.toUpperCase();
            revStr+=temp.charAt(0)+str1.substring(1)+" ";
        }
        System.out.println("Reversed String is :"+revStr);
    }
}
