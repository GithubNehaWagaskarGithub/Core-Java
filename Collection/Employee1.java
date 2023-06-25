package Collection;

public class Employee1 {
   private static Employee1 e1;
    private static int count=0;
    private int empId;
    private String empName;
    private double empSal;

    public Employee1(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

   // public Employee1()
    {

    }
    private Employee1()
    {
        System.out.println("Constructor");
        count++;
    }
   /* public static Employee m1()
    {
        if(count==0)
        {
            e1=new Employee1();
        }
        return e1;
    }*/
    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public double getEmpSal()
    {
        return empSal;
    }
    public void setEmpSal(double empSal)
    {
        this.empSal=empSal;
    }

    @Override
    public String toString() {
        return
                "empId=" + empId +
                ", empName=" + empName +
                ", empSal=" + empSal ;
    }
}
