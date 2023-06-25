package Constructor;

class Company {
        int empId;
        String empName;
        double sal;
        int yoe;
        Company(int e1,String e2,double s1,int y1)
        {
            empId=e1;
            empName=e2;
            sal=s1;
            yoe=y1;
        }
        Company(int e1,String e2,double s1)
        {
            empId=e1;
            empName=e2;
            sal=s1;
        }
        public void displayInfo()
        {
            System.out.println("Emp ID :"+empId);
            System.out.println("Emp Name :"+empName);
            System.out.println("Salary :"+sal);
            System.out.println("YOE :"+yoe);
        }
    }
    public class Program4
    {
        public static void main(String [] args)
        {
            Company emp1=new Company(11,"Neha",67000.00,5);
            emp1.displayInfo();
            Company emp2=new Company(12,"Vishal",45000.00);
            emp2.displayInfo();
        }
    }

