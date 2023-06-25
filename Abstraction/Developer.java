package Abstraction;

public class Developer implements Employee
{
    @Override
    public void getEmployeeType()
    {
        System.out.println("Employee is Developer");
    }

    @Override
    public void hikeSalary(double sal)
    {
        sal=sal+sal*70/100;
        System.out.println("Hike Salary ;"+sal);
    }
}
