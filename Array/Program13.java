package Array;

public class Program13
{
    public static void main(String[] args)
    {
        int [] arr={32,45,76,98,10,43};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum Number in an Array:"+min);
    }
}
