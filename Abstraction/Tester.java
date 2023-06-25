package Abstraction;

public class Tester implements Employee
{
    @Override
    public void getEmployeeType()
    {
        System.out.println("Employee is Tester");
    }

    @Override
    public void hikeSalary(double sal)
    {
        sal=sal+sal*10/100;
        System.out.println("Hike Salary :"+sal);
    }
}
