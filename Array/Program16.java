package Array;

public class Program16
{
    public static void main(String[] args)
    {
        char [] arr={'A','b','c','D','s'};
        char max=arr[0];

        for (int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("largest character is :"+max);
    }
}
