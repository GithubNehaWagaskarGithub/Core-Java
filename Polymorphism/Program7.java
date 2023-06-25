package Polymorphism;

public class Program7 {
    public void searchEmp(int empId)
    {
        if(empId==1234)
        {
            System.out.println("Employee is Found");
        }
        else {
            System.out.println("Employee is not Found");
        }
    }
    public void searchEmp(String empName)
    {
        if (empName.equalsIgnoreCase("EMPLOYEE"))
        {
            System.out.println("Employee is Found");
        }
        else
        {
            System.out.println("Employee is not Found");
        }
    }
    public void searchEmp(int deptNo,String desig)
    {
        if(deptNo==10 && desig=="Manager")
        {
            System.out.println("Employee is Found");
        }
        else
        {
            System.out.println("Employee is not Found");
        }
    }
}
