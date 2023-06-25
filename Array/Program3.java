package Array;

public class Program3 {   // for each loop //
    public static void main(String[] args) {
        int []arr;
        arr=new int[5];
        arr[0]=10;
        arr[1]=30;
        arr[2]=50;
        arr[3]=70;
        arr[4]=90;

        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
