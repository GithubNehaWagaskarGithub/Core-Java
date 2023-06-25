package Application;

import java.util.Scanner;

public class MainApp1 {
    static int i = 0;
    static Scanner sc = new Scanner(System.in);
    static Student[] data;

    static {
        System.out.println("Enter the size of array !!");
        int size = sc.nextInt();
        data = new Student[size];
    }

    public static void main(String[] args) {
        boolean status = true;
        do {
            System.out.println("1.Add Student");
            System.out.println("2.Display Student");
            System.out.println("3.Display By Roll No");
            System.out.println("4.Update Student");
            System.out.println("5.Remove Student");
            System.out.println("6.Exit !!");
            int ch = sc.nextInt();
            if (ch == 1) {
                if (i < data.length) {
                    data[i++] = addStudent();
                }
            } else if (ch == 2) {
                display();
            } else if (ch == 3) {
                displayById();
            } else if (ch == 4) {
                updateStudent();
            } else if (ch == 5) {
                if (i > data.length) {
                    data[i--] = removeStudent();
                }
            } else {
                status = false;
            }

        } while (status);
    }

    public static Student addStudent() {
        System.out.println("Enter Roll No");
        int rollNo = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Marks");
        double marks = sc.nextDouble();
        Student s1 = new Student(rollNo, name, marks);
        return s1;
    }

    public static void display() {
        for (Student s : data) {
            System.out.println("Roll No :" + s.rollNo);
            System.out.println("Name :" + s.name);
            System.out.println("Marks :" + s.marks);
            System.out.println("-----------------------");
        }
    }

    public static void displayById() {
        System.out.println("Enter RollNo !!");
        int rollNo = sc.nextInt();
        for (Student s : data) {
            if (s.rollNo == rollNo) {
                System.out.println("Student Roll No :" + s.rollNo);
                System.out.println("Student Name :" + s.name);
                System.out.println("Student Marks :" + s.marks);
            }
        }
    }

    public static Student updateStudent() {
        System.out.println("Enter Roll No which you wants to update !!");
        int rollNo = sc.nextInt();
        System.out.println("Update a Name");
        String name = sc.next();
        System.out.println("Update a Marks");
        double marks = sc.nextDouble();
        for (Student s : data) {
            if (s.rollNo == rollNo) {
                Student s2 = new Student(rollNo, name, marks);
                System.out.println("Student Roll No :" + s2.rollNo);
                System.out.println("Student Name :" + s2.name);
                System.out.println("Student Marks :" + s2.marks);
                System.out.println("------------------------");
            }
        }
        Student s2 = new Student(rollNo, name, marks);
        return s2;
    }

    public static Student removeStudent() {
        System.out.println("Enter a Roll No which you wants to Remove !!");
        int rollNo = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();
        for (Student s : data) {
            if (s.rollNo == rollNo) {
                Student s3 = new Student(rollNo, name, marks);
                System.out.println("Student Roll No :" + s3.rollNo);
                System.out.println("Student Name :" + s3.name);
                System.out.println("Student Marks :" + s3.marks);
                System.out.println("------------------------");
            }
        }
        Student s3 = new Student(rollNo, name, marks);
        return s3;
    }
}
