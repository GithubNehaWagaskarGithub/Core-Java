package encapsulation;

public class MainApp {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"Emp3",25000);
        Employee e2=new Employee(102,"Emp2",35000);
        e1.setEmpName("Emp1");
        e2.setEmpSal(45000);
        System.out.println("Employee Id :"+e1.getEmpId());
        System.out.println("Employee Name :"+e1.getEmpName());
        System.out.println("Employee Salary :"+e1.getEmpSal());

        System.out.println("----------------------------");

        System.out.println("Employee Id :"+e2.getEmpId());
        System.out.println("Employee Name :"+e2.getEmpName());
        System.out.println("Employee Salary :"+e2.getEmpSal());

    }
}
