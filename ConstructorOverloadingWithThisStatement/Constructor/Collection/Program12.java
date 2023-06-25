package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program12 {
    public static void main(String[] args) {
        List<String> courseList=new ArrayList<String>();//Upcasting
        courseList.add("Core Java");
        courseList.add("SQL");
        courseList.add("Aptitude");
        courseList.add("Web-tech");
        courseList.add("Python");

        System.out.println("Using for-each loop");

        for(String c:courseList)
        {
            //System.out.println(c);
            courseList.add("Manual");
            courseList.set(3,"Selenium");//by using for-each loop We cant modify the collection
            System.out.println(c);
        }
    }
}
