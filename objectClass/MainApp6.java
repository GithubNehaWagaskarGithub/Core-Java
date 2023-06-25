package objectClass;

public class MainApp6 {
    public static void main(String[] args) {
        double d1=99.89;
        System.out.println(d1);
        Double d2=d1;    //Auto boxing
        System.out.println(d2);
        double d3=d2;    //Auto unboxing
        System.out.println(d3);
        System.out.println(d2.getClass());
        System.out.println(d2.getClass().getSimpleName());
    }
}
