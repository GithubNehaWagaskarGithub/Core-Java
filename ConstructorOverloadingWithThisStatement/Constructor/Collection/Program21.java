package Collection;

import java.util.HashSet;
import java.util.Set;//Set is an Interface Set has three Implementations Class they are HashSet,LinkedHashSet,TreeSet

public class Program21 {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();//In HashSet we Can Store the data uniquely Randomly Manner.
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.add(10);
        System.out.print(s1);

        System.out.println();

        for(Integer s:s1)
        {
            System.out.println(s);
        }
    }
}
