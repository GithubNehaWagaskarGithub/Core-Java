package Collection;

import java.util.ArrayList;

public class MainApp3 {
    public static void main(String[] args) {
        Employee1 e=new Employee1(101,"Emp1",25000);

        /*Employee1 ee=new Employee1();
        ee.setEmpId(102);
        ee.setEmpName("Emp2");
        ee.setEmpSal(17000);

        Employee1 eee=new Employee1();
        eee.setEmpId(103);
        eee.setEmpName("Emp3");
        eee.setEmpSal(37000);*/

        ArrayList<Employee1> empInfo=new ArrayList<Employee1>();
        empInfo.add(e);
       // empInfo.add(ee);
       // empInfo.add(eee);

        for (int i=0;i<empInfo.size();i++)
        {
            System.out.println(empInfo.get(i));
        }
    }
}
