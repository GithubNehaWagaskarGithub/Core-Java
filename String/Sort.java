package String;

public class Sort
{

    public static void sort(char[] arr)
    {
        for(int j=0;j<arr.length-1;j++) {
            if (arr[j] > arr[j + 1]) {
                char temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
        for(char a:arr)
        {
            System.out.println(a);
        }
    }
}
