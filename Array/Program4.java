package Array;

public class Program4 {  // for each loop//
    public static void main(String[] args) {
        int [] arr;
        arr=new int[6];
        //arr[0]=0;
        arr[1]=20;
        arr[2]=40;
        arr[3]=60;
        arr[4]=80;
        arr[5]=100;

        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
