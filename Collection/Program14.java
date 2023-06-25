package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program14 {
    public static void main(String[] args) {
        List<String> courseList=new ArrayList<String>();
        courseList.add("Core Java");
        courseList.add("Python");
        courseList.add("SQL");
        courseList.add("Manual");
        courseList.add("Aptitude");
        System.out.println(courseList);

        System.out.println("Using ListIterator Interface");

        ListIterator<String> litr=courseList.listIterator();

        while(litr.hasNext())
        {
            String s=litr.next();
            System.out.println(s);
            System.out.println(litr.previousIndex());
            System.out.println(litr.nextIndex());//previousIndex Method
        }
        System.out.println("Reverse Order :------------------------");
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
            System.out.println(litr.nextIndex());

        }

    }
}
