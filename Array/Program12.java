package Array;

public class Program12 {
    public static void main(String[] args) {
        int [] arr={43,22,78,99,11,55};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if (max <arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number in Array is :" + max);

        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum Number in Array is :"+min);
    }
}
