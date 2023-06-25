package Collection;

import java.util.ArrayList;

public class Program8 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();

        a1.add(20);
        a1.add(true);
        a1.add("Core Java");
        a1.add(20.2);
        System.out.println(a1);

        ArrayList a2=new ArrayList();
        a2.addAll(a1);// addAll method add all element into one array to another array
        System.out.println(a2);
    }
}
