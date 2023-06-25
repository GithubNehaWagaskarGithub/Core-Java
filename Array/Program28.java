package Array;

public class Program28
{
    public static void main(String[] args) {
        Employee[] emp=new Employee[4];

        emp[0]=new Employee("Vishal","System Admin",35000.00,"Experience",3);
        emp[1]=new Employee("Neha","Manager",30000.00,"Fresher",1);
        emp[2]=new Employee("Aishwarya","Developer",60000.00,"Experience",5);
        emp[3]=new Employee("Ayush","Tester",40000.00,"Fresher",1);

        Employee.company="Infosys";

        for(int i=0;i<emp.length;i++)
        {
            emp[i].displayInfo();
        }
    }
}
