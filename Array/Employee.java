package Array;

public class Employee {
    static String company;
    String empName;
    String job;
    double salary;
    String status;
    int yearOfExp;

    Employee(String e1,String j1,double s1,String s2,int y1)
    {
        empName=e1;
        job=j1;
        salary=s1;
        status=s2;
        yearOfExp=y1;
    }
    public void displayInfo()
    {
        System.out.println("Company :"+company);
        System.out.println("Employee Name :"+empName);
        System.out.println("Job Title: "+job);
        System.out.println("Salary :"+salary);
        System.out.println("Status :"+status);
        System.out.println("Year of Experience :"+yearOfExp);
        System.out.println("-----------------------");
    }
}
