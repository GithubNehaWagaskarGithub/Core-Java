package Collection;

import java.util.ArrayList;

public class Program9 {
    public static void main(String[] args) {
        ArrayList data=new ArrayList();
        data.add(10);
        data.add("Core java");
        data.add('A');
        data.add(2,100.99);//add Method
        System.out.println(data);
        data.remove("Core java");//remove method
        System.out.println(data);
        int len=data.size();// size method
        System.out.println(len);
        data.set(2,'Z');//set method
        System.out.println(data);
        boolean b1=data.contains(10);//contains method
        System.out.println(b1);
        ArrayList data2=new ArrayList();
        data2.addAll(data);//addAll method
        System.out.println(data2);
    }
}
