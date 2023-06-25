package Collection;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(0,'A');
        a1.add(1,"Core Java");
        a1.add(2,null);
        a1.add(3,10);//add a value by using index value
        System.out.println(a1);
    }
}
