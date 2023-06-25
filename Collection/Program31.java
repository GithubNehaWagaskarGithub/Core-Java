package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program31 {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();//Uniquely or Random manner
        m1.put("Core Java",8000);
        m1.put("SQL",2000);
        m1.put("Manual Testing",16000);//put() for to insert a values
        m1.put("Selenium",10000);
        m1.put("SQL",3000);//we can not insert a duplicate key If We can insert a duplicate key then updated value is inserted.
        System.out.println(m1);
        System.out.println("--------------------------");
        Set<String> keys=m1.keySet();//return a set all the keys available inside the Map.
        for(Object s:keys)
        {
            System.out.println(s+" : "+m1.get(s));
        }
        System.out.println("--------------------------");
        Collection<String> l2=m1.keySet();//return a available Keys inside the map.
        for(String j:l2)
        {
            System.out.println(j);
        }
        System.out.println("--------------------------");
        Collection<Integer> l1=m1.values();//return a available values inside the map.
        for(Integer i:l1)
        {
            System.out.println(i);
        }
        System.out.println("--------------------------");
        Set s1=m1.entrySet();
        for(Object m:s1)
        {
            System.out.println(m);
        }
    }
}
