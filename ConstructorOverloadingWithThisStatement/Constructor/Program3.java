package Constructor;

class Program33
    {
        boolean hands;
        boolean legs;
        int wings;
        Program33(boolean h1,boolean l1)
        {
            hands=h1;
            legs=l1;
        }
        Program33(boolean l1,int w1)
        {
            legs=l1;
            wings=w1;
        }
        public void displayInfo()
        {
            System.out.println("Hands :"+hands);
            System.out.println("Legs :"+legs);
            System.out.println("Wings :"+wings);
        }
    }
    class Program3
    {
        public static void main(String [] args)
        {
            Program33 m1=new Program33(true,true);
            m1.displayInfo();
            Program33 m2=new Program33(true,2);
            m2.displayInfo();
        }
    }
