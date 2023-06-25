package Array;

public class Program17 {
    public static void main(String[] args) {
        char [] arr={'A','B','C','D','E'};
        char min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Character is :"+min);
    }
}
