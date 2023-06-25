package String;

public class Program14 {
    public static void main(String[] args) {

        String str1 = "core";
        str1="java";//when a new value is assigned to it a new string object gets created and the references
                                                //if moved to the new object.
        System.out.println("address of str1 :"+System.identityHashCode(str1));
    }
}
