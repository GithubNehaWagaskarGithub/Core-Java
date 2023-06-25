package Collection;

import java.util.ArrayList;

public class NonGeneric {
    public static void main(String[] args) {
        ArrayList data=new ArrayList();//this is Non-generic ArrayList in that we can store the different types of object.
        data.add(10);                  //It is not mandatory to specify the data type of Non-generic ArrayList.
        data.add("Core Java");
        data.add(true);
        data.add('A');
        data.add(10.20);
        data.add(false);

        System.out.println(data);
    }
}
