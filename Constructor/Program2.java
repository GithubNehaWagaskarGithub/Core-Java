package Constructor;

class Constructor {
        int a;
        static int b;
        static int c;
        Constructor(int a1)
        {
            a=a1;
            //System.out.println("A :"+a);
        }
        Constructor(int a1,int b1,int c1)
        {
            a=a1;
            b=b1;
            c=c1;
        }
        public void display()
        {
            System.out.println("A :"+a);
            System.out.println("B :"+b);
            System.out.println("C :"+c);
        }
    }
    public class Program2
    {
        public static void main(String [] args)
        {
            Constructor m1=new Constructor(10,20,30);
            //m1.display();
            Constructor m2=new Constructor(10);
            //m2.display();
            Constructor m3=new Constructor(40,50,60);
            //m3.display();
            Constructor m4=new Constructor(10);
            //m4.display();
        }
    }
