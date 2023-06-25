package ConstructorChaining;

public class Student extends College {
    public Student(String uni,String col,String name)
    {
        super(uni,col);
        System.out.println("Student Name :"+name);
    }
}
