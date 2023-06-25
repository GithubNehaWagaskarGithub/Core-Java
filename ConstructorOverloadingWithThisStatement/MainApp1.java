package ConstructorOverloadingWithThisStatement;

public class MainApp1 {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Neha","Developer",25000);
       e1.displayInfo();
        Employee e2=new Employee(2,"Ayush","Tester",10,67000);
        e2.displayInfo();
    }
}
