package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program23 {
    public static void main(String[] args) { //this is generic set
        Set<String> subject=new LinkedHashSet();//In LinkedHashSet we Can Store the data uniquely or in sequential Manner.
        subject.add("Core Java");
        subject.add("SQL");
        subject.add("MangoDB");
        subject.add("Hibernate");
        subject.add("J2EE");
        subject.add("SQL");

        System.out.println(subject);

        for(String s:subject)
        {
            System.out.println(s);
        }
    }
}
