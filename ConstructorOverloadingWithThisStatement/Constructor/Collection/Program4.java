package Collection;

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add('A');
        a1.add(20.2);
        a1.add("Core Java");
        //a1.remove(1);//remove by index value
        a1.remove(20.2);//remove by object value
        System.out.println(a1);
    }
}
