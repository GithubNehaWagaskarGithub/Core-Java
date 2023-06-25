package Looping_Statements;

public class Program12 {
    public static void main(String[] args) {
        for (int j=1;j<=5;j++) {
            for (int i=j--;i>=1;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
