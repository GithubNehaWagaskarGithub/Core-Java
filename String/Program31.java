package String;

public class Program31 {
    public static void main(String[] args) {
        String str="Good_Morning";
        int no=3;
        int len=str.length()/no;
        //System.out.println(len);
        if(str.length()%no==0)
        {
            for(int i=0;i<str.length();i=i+len)
            {
                System.out.println(str.substring(i,i+len));
            }
        }
        else
        {
            System.out.println("String cant not divide into equals parts");
        }
    }
}
