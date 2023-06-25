package Collection;

import java.util.Set;
import java.util.TreeSet;

public class Program25 {
    public static void main(String[] args) {//this is generic set
        Set<String> s1=new TreeSet<>();//In LinkedHashSet we Can Store the data uniquely or in sorted Manner.
        s1.add("abc");
        s1.add("aab");
        s1.add("aaa");
        s1.add("aab");
        System.out.println(s1);

        for(String s:s1)
        {
            System.out.println(s);
        }
    }
}
