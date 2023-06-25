package ConstructorOverloadingWithThisStatement;

public class Employee {
    int empId;
    String empName;
    String job;
    int yoe;
    double empSal;
    Employee(int empId,String empName,String job,double empSal)
    {
        this.empId=empId;
        this.empName=empName;
        this.job=job;
        this.empSal=empSal;
    }
    Employee(int empId,String empName,String job,int yoe,double empSal)
    {
        this(empId,empName,job,empSal);
        this.yoe=yoe;
    }
    public void displayInfo()
    {
        System.out.println("EmpId :"+empId);
        System.out.println("EmpName :"+empName);
        System.out.println("Job :"+job);
        System.out.println("YOE :"+yoe);
        System.out.println("EmpSal :"+empSal);
        System.out.println("-----------------------");
    }
}
