package ConstructorChaining;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a University Name :");
        String uni=sc.next();
        System.out.println("Enter a College Name :");
        String col=sc.next();
        System.out.println("Enter a Student Name :");
        String name=sc.next();

        Student s1=new Student(uni,col,name);
    }
}
