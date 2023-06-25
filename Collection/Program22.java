package Collection;

import java.util.HashSet;
import java.util.Set;

public class Program22 {
    public static void main(String[] args) {//In HashSet we Can Store the data uniquely or Randomly Manner.
        Set s1=new HashSet();
        s1.add(10);
        s1.add("core java");
        s1.add('A');
        s1.add(20.2);
        s1.add(false);
        s1.add(10);

        System.out.println(s1);

        for(Object o:s1)
        {
            System.out.print(o+" ,   ");
        }
    }
}
