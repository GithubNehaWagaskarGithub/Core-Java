package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program28 {
    public static void main(String[] args) {//Requirement is to store the data in sorted manner or duplicate also
        int[] arr={10,30,10,30,20,15};
        List<Integer> s1=new ArrayList<>();
        for(Integer a:arr)
        {
            s1.add(a);
        }
        System.out.println(s1);
        Collections.sort(s1);
        System.out.println(s1);
        Collections.reverse(s1);
        System.out.println(s1);
        System.out.println("Max :"+Collections.max(s1));
        System.out.println("Min :"+Collections.min(s1));
    }
}
