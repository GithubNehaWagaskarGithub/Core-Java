package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program27 {
    public static void main(String[] args) {
        System.out.println("unique or random Manner :");
        int[] arr={12,14,14,12,17,16,19,19};//Requirement is to store the date in unique or random Manner
        Set<Integer> s1=new HashSet<>();
        for(Integer a:arr)
        {
            s1.add(a);
        }
        System.out.println(s1);
        System.out.println("unique or in sequential Manner :");
        int[] arr1={12,14,14,12,17,16,19,19};//Requirement is to store the date in unique or in sequential Manner
        Set<Integer> s2=new LinkedHashSet<>();
        for(Integer a:arr)
        {
            s2.add(a);
        }
        System.out.println(s2);
        System.out.println("unique or in sorted Manner :");
        int[] arr3={12,14,14,12,17,16,19,19};//Requirement is to store the date in unique or in sorted Manner
        Set<Integer> s3=new LinkedHashSet<>();
        for(Integer a:arr)
        {
            s3.add(a);
        }
        System.out.println(s3);
    }
}
