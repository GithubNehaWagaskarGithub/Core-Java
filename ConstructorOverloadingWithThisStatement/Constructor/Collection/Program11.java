package Collection;

import java.util.ArrayList;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<String> courseList = new ArrayList<String>();
        //List<String> courseList=new ArrayList<String>();// Upcasting happen here because List is a super class and
        courseList.add("Core Java");                      // ArrayList is a sub Class.
        courseList.add("SQL");
        courseList.add("Aptitude");
        courseList.add("Web-tech");
        courseList.add("Python");
        System.out.println(courseList);

        System.out.println("Using for Loop :");

        for(int i=0;i<courseList.size();i++)
        {
            System.out.println(courseList.get(i));
        }
        courseList.add("Manual");
        courseList.set(3,"Selenium");
        System.out.println(courseList);
        System.out.println("---------------------------");
        for(int i=courseList.size()-1;i>=0;i--)
        {
            System.out.println(courseList.get(i));
        }
    }
}
