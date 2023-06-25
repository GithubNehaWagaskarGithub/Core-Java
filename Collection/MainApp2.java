package Collection;

import java.util.ArrayList;

public class MainApp2 {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"Emp1",10,"Developer",25000);
        Employee e2=new Employee();
        e2.setEmpId(102);
        e2.setEmpName("Emp2");
        e2.setDeptNo(10);
        e2.setDesig("Tester");
        e2.setSal(15000);

        Employee e3=new Employee();
        e3.setEmpId(103);
        e3.setEmpName("Emp3");
        e3.setDeptNo(10);
        e3.setDesig("Data Analyst");
        e3.setSal(35000);

        ArrayList<Employee> empInfo=new ArrayList<Employee>();
        empInfo.add(e1);
        empInfo.add(e2);
        empInfo.add(e3);

        for(int i=0;i<empInfo.size();i++)
        {
            System.out.println("Employee : "+empInfo.get(i));
        }
    }
}
