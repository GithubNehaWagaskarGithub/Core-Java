package Array;

public class Program23 {
    public static void main(String[] args) {
        int [][] arr={
                    {10,20},
                    {30,40},
                    {50,60}
                };
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
