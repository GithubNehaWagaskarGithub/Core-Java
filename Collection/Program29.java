package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program29 {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();//Uniquely or Random manner
        m1.put("Core Java",8000);
        m1.put("SQL",2000);
        m1.put("Manual Testing",16000);
        m1.put("SQL",3000);//we can not insert a duplicate key If We can insert a duplicate key then updated value is inserted.
        System.out.println(m1);

        Map<String,Integer> m2=new LinkedHashMap<>();//Uniquely or sequential manner
        m2.put("Core Java",8000);
        m2.put("SQL",2000);
        m2.put("Manual Testing",16000);
        m2.put("Selenium",10000);
        m1.put("SQL",3000);//Not updated value will be printed
        System.out.println(m2);

        Map<String,Integer> m3=new LinkedHashMap<>();//Uniquely or sorted manner
        m3.put("Core Java",8000);
        m3.put("SQL",2000);
        m3.put("Manual Testing",16000);
        m3.put("Selenium",10000);
        m3.put("SQL",3000);//Updated value will be printed
        System.out.println(m3);

    }
}
