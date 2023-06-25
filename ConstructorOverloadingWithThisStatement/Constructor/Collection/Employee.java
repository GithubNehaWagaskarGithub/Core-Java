package Collection;

public class Employee {
    private int empId;
    private String empName;
    private int deptNo;
    private String desig;
    private double sal;

    public Employee()
    {

    }

    public Employee(int empId, String empName, int deptNo, String desig, double sal) {
        this.empId = empId;
        this.empName = empName;
        this.deptNo = deptNo;
        this.desig = desig;
        this.sal = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return
                "Employee Id=" + empId +
                ", Employee Name=" + empName +
                ", Dept No=" + deptNo +
                ", Designation=" + desig +
                ", Salary=" + sal ;
    }
}
