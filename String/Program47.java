package String;

public class Program47 {
    public static void main(String[] args) {
        String str = "STAR";
        int line = 4;
        int star = 4;
        int ch1 =0;
        char[] arr=str.toCharArray();
        for (int i=0;i<line;i++) {
            int ch2 =ch1;
            for (int j = 0; j < star; j++)
            {
                System.out.print(arr[ch2] + " ");
                ch2++;
                if (ch2 > 3)
                {
                    ch2=0;
                }
            }
            System.out.println();
            ch1+=2;

        }
    }
}
