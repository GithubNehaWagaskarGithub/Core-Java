package Constructor;

class  Laptop {

        String company;
        int os;
        String color;
        Double price;

        Laptop(String c1 , int o1 ,String c2 ,double p1 )
        {
            company=c1;
            os=o1;
            color=c2;
            price=p1;
        }
        public void displayInfo()
        {
            System.out.println("Company: "+company);
            System.out.println("OS: "+os);
            System.out.println("Color: "+color);
            System.out.println("Price: "+price);
            System.out.println("-------------------");
        }
    }
    public class Program1
    {
        public static void main(String [] args)
        {
            Laptop l1=new Laptop("HP",10,"Black",74000.90);
            Laptop l2=new Laptop("LENOVO",11,"Silver",65000.67);
            l1.company="DELL";
            l2.company="HHP";
            l1.displayInfo();
            l2.displayInfo();
        }
    }

