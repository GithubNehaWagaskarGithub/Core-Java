package objectClass;

public class MainApp8 {
    public static void main(String[] args) {
        String str="456212";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //System.out.println(ch);

            int a=Integer.parseInt(ch+"");  //Or String a=Character.toString(ch);
            //System.out.println(a);          //   int b=Integer.parseInt(a);
            sum+=a;
        }
        System.out.println("Sum is :"+sum);
    }
}
