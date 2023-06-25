package Collection;

import java.util.Vector;

public class Program15 {
    public static void main(String[] args) {
        Vector<Double> d1=new Vector<Double>();
        d1.add(10.10);
        d1.add(20.20);
        d1.add(30.20);
        d1.add(40.20);
        d1.add(1,50.20);
        System.out.println(d1);
        d1.remove(20.20);
        System.out.println(d1);
        d1.set(3,45.33);
        System.out.println(d1);
        System.out.println(d1.size());

        Vector<Double> d2=new Vector<>();
        d2.addAll(d1);
        System.out.println(d2);

        System.out.println("------------------------------");
        for(int i=0;i<d1.size();i++)
        {
            System.out.println(d1.get(i));
        }

        System.out.println("------------------------------");
        for(Double d:d1)
        {
            System.out.println(d);
        }
    }
}
