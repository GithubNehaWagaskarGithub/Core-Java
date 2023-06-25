package String;

public class Program33 {
    public static void main(String[] args) {
        String str="HTML_CSS_JS_REACT";
        System.out.println("Original String is :"+str);
        String[] s1=str.split("_");
        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }

        System.out.println("=====================");

        for(int i=s1.length-1;i>=0;i--)
        {
            System.out.println(s1[i]);
        }
    }
}
