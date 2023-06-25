package Array;

public class Program21 {
    public static void main(String[] args) {
        int[][] bank={
                {100,150,200},
                {270,50,100},
                {750,70,10}
        };
        int maxsum=0;
        int sum=0;
        int customer=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum += bank[i][j];
            }
            if(maxsum<sum)
            {
                maxsum=sum;
                customer=i;
            }
            sum=0;
        }
        System.out.println("Richest Person:"+maxsum);
        System.out.println("Customer :"+customer);
    }
}
