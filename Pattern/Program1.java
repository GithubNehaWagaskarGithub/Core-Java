package Pattern;

public class Program1 {
    public static void main(String[] args) {
        int line=6;
        int star=1;
        int space=5;
        for(int i=0;i<line;i++)
        {
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<star;j++)
            {
                if((i==2 && j==1)||(i==4 && j==1)||(i==4 && j==2)||(i==4 && j==3)||(i==5 && j==1)||(i==5 && j==2)||(i==5 && j==3)||(i==5 && j==4))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
            star++;
            space--;
        }
    }
}
