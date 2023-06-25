package Collection;

import java.util.Set;
import java.util.TreeSet;//Tree Set is always Generic

public class Program26 {//We Can Not Create a Non-Generic Array because Tree set properties are unique data or in sorted Manner
                        //when our values are different types then at the time of sorting they will not understand to which manner
                        // is used for to sort the Tree set.
    public static void main(String[] args) {//this is non-generic set but every value is in the String data type
        Set s1=new TreeSet();//In LinkedHashSet we Can Store the data uniquely or in sorted Manner.
        s1.add("abc");
        s1.add("10");
        s1.add("false");
        s1.add("aab");
        s1.add("10.2");
        System.out.println(s1);

        for(Object s:s1)
        {
            System.out.println(s);
        }
    }
}
