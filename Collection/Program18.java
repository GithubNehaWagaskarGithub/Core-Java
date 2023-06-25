package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Program18 {
    public static void main(String[] args) {
        List<String> course=new LinkedList<>();
        course.add("Core Java");
        course.add("SQL");
        course.add("Web-Tech");
        course.add("J2EE");
        course.add("Hibernate");
        course.add(2,"Python");
        course.remove("Web-Tech");
        System.out.println(course);

        System.out.println("---------------------------------");

        for(int i=0;i< course.size();i++)
        {
            System.out.println(course.get(i));
        }

        System.out.println("---------------------------------");

        for(String a:course)
        {
            System.out.println(a);
        }

        System.out.println("------------------------------------");

        Iterator<String> itr= course.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("----------------------------------");

        ListIterator<String> litr= course.listIterator();
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("-----------------------------------");

        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

    }
}
