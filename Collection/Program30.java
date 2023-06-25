package Collection;

import java.util.HashMap;
import java.util.Map;

public class Program30 {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();//Uniquely or Random manner
        m1.put("Core Java",8000);
        m1.put("SQL",2000);
        m1.put("Manual Testing",16000);//put() for to insert a values
        m1.put("Selenium",10000);
        m1.put("SQL",3000);//we can not insert a duplicate key If We can insert a duplicate key then updated value is inserted.
        System.out.println(m1);
        System.out.println(m1.size());//Size() for to count the total no. of entries in Map.
        System.out.println(m1.containsKey("SQL"));//to check the key is present or not.
        System.out.println(m1.containsValue(8000));//to check the Value is present or not.
        System.out.println(m1.get("SQL"));//return a value according to key.
        m1.remove("Selenium");//remove the entry from the Map
        m1.remove("Selenium",10000);//remove the entry from the Map
        System.out.println(m1);

    }
}
