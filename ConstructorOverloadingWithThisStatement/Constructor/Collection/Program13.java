package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program13 {
    public static void main(String[] args) {
        List<String>courseList=new ArrayList<String>();
        courseList.add("Core Java");
        courseList.add("Python");
        courseList.add("SQL");
        courseList.add("Aptitude");
        courseList.add("Web-Tech");
        System.out.println(courseList);

        System.out.println("By Using Iterator Interface :");
        Iterator itr=courseList.iterator();
        while(itr.hasNext())
        {
            String course=itr.next()+" ";
            System.out.println(course);
            /*courseList.add("Manual");
            courseList.remove("SQL");
            System.out.println(course);*/
        }

    }
}
