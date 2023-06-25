package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program24 {
    public static void main(String[] args) {//this is non-generic set
        Set s1=new LinkedHashSet();//In LinkedHashSet we Can Store the data uniquely or in sequential Manner.
        s1.add("Neha");
        s1.add(10);
        s1.add("Ayush");
        s1.add(false);
        s1.add(20.2);
        s1.add("Neha");
        System.out.println(s1);
        for(Object s:s1)
        {
            System.out.println(s);
        }
    }
}
