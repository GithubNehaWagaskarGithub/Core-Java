package Collection;

import java.util.ArrayList;

public class Program6 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20.2);
        a1.add('A');
        a1.add("Core Java");
        a1.add(true);
        System.out.println(a1);

        a1.set(2,'B');
        a1.set(4,false);//set method set the value with using index value
        System.out.println(a1);
    }
}
