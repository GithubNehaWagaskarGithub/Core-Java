package String;

public class Proam16 {
    public static void main(String[] args) {
        String str="GooD Morning";
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                str1+=str.toLowerCase().charAt(i);
            }
            else
            {
                str1+=str.toUpperCase().charAt(i);
            }
        }
        System.out.println("Original String is :"+str);
        System.out.println("New String :"+str1);
    }
}
