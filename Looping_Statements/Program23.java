package Looping_Statements;

public class Program23 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<11;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("sum :"+sum);
    }
}
