package encapsulation;

public class MainApp1 {
    public static void main(String[] args) {
        Student s1=new Student(101,"Neha",75);
        Student s2=new Student(102,"Aishu",88);

        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

        System.out.println("-------------------");

        s1.setRollNo(104);
        s1.setName("Vishal");
        s1.setMarks(90);

        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }
}
