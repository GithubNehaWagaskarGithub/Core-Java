package Collection;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import java.util.ListIterator;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<String> courseList=new ArrayList<String>();
        //List<String> courseList=new ArrayList<String>();// Upcasting happen here because List is a super class and
        courseList.add("Core Java");                      // ArrayList is a sub Class.
        courseList.add("SQL");
        courseList.add("Aptitude");
        courseList.add("Manual Testing");
        courseList.add("Automation Testing");
        System.out.println(courseList);

        System.out.println("-------------------------------------");
        System.out.println("Using For Loop");

        for (int i=0;i<courseList.size();i++)
        {
            System.out.println(courseList.get(i));
        }

        System.out.println("--------------------------------------");
        System.out.println("Using For-Each Loop");

        for (String c:courseList)
        {
            System.out.println(c);
        }

        System.out.println("--------------------------------------");
        System.out.println("Using Iterator Interface");

        Iterator itr=courseList.iterator();//Iterator is an Interface
        while(itr.hasNext()) // hasNext Method is used for to check the next element is present or not
        {                    // hasNext Method is used to traversing the list in the forward direction.
            String course=itr.next()+" ";//Parsing happen here //Next method is returns the next element in ArrayList
                                        //returns the next element in the list.
            System.out.println(course);
        }


        System.out.println("--------------------------------------");
        System.out.println("Using ListIterator Interface");

        ListIterator litr=courseList.listIterator();
        while(litr.hasNext())
        {
            //String course1=litr.next()+" ";//parsing happen here
            //System.out.println(course1);
            System.out.println(litr.next());
        }

        System.out.println("----------------------------------------");
        System.out.println("By Using ListIterator in Descending Order :");
        while(litr.hasPrevious())//has Previous Method is checks the previous element is present or not in array
        {                        // this will be happened only that time when our cursor is at the last position in the array
                                 // then they playing with the previous elements in the array.
            // hasprevious Method is used to traversing the list in the reverse direction.
            System.out.println(litr.previous());//previous method is returns the previous element in ArrayList
        }                                        //returns the previous element in the list.
    }
}
