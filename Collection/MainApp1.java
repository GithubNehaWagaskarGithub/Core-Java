package Collection;

import java.util.ArrayList;

public class MainApp1 {
    public static void main(String[] args) {
        Student s1=new Student(101,"Neha",88.90);

        Student s2=new Student();
        s2.setsId(102);
        s2.setsName("Mina");
        s2.setsMarks(65.55);

        Student s3=new Student();
        s3.setsId(103);
        s3.setsName("Aishu");
        s3.setsMarks(46.88);

        ArrayList<Student> studentData=new ArrayList<Student>();
        studentData.add(s1);
        studentData.add(s2);
        studentData.add(s3);
        System.out.println(studentData);
        System.out.println("-----------------------------------------------------------------------------------------------");

       for(Student s:studentData)
       {
           if(s.getsId()==101)
           {
               System.out.println(s);
           }
       }
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(Student s:studentData)
        {
            if(s.getsName().equals("Neha") )
            {
                s.setsMarks(99.99);
            }
        }
        for(Student s:studentData)
        {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(Student s:studentData)
        {
            if(s.getsName()=="Aishu")
            {
                System.out.println(s);
            }
        }
    }
}
