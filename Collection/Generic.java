package Collection;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<String> courseList=new ArrayList<String>();//this is generic ArrayList in that we can store the similar types
                                                             // of object.
        courseList.add("Core Java");                         //it is mandatory to specify the data type of generic ArrayList.
        courseList.add("J2EE");
        courseList.add("Web Tech");
        courseList.add("Aptitude");
        courseList.add("SQL");
        courseList.add("MangoDB");
        courseList.add("Python");
        System.out.println("Available Course List is :"+courseList);

        ArrayList<Integer> EmpId=new ArrayList<Integer>();
        EmpId.add(101);
        EmpId.add(102);
        EmpId.add(103);
        EmpId.add(104);
        EmpId.add(105);
        System.out.println("Available EmpId is"+EmpId);
    }
}
