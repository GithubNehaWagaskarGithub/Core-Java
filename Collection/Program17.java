package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program17 {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        l1.push("Core Java");
        l1.add("Aptitude");
        l1.add("Manual");
        l1.add("SQL");
        l1.add("Selenium");
        System.out.println(l1);
        System.out.println("--------------------------");
        for(int i=0;i< l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println("--------------------------");
        for(String s:l1)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------");
        Iterator<String> i1=l1.iterator();
        while (i1.hasNext())
        {
            String str1= i1.next();
            System.out.println(str1);
        }
        System.out.println("-----------------------------");
        ListIterator<String> i2= l1.listIterator();
        while(i2.hasNext())
        {
            String str2= i2.next();
            System.out.println(str2);
        }
        System.out.println("------------------------------");
        while(i2.hasPrevious())
        {
            System.out.println(i2.previous());
        }
    }
}
