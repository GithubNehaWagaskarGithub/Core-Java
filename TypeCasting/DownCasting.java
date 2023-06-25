package TypeCasting;

public class DownCasting {
    public static void main(String[] args) {
        /*Parent1 p1=new Parent1();
        p1.name="Neha";
        p1.show();

        Child1 c1=new Child1();
        c1.age=10;
        c1.name="Wagaskar";
        c1.show();*/

        Parent1 p2=new Child1();
        p2.name="Neha";

        Child1 c2=(Child1) p2;
        c2.age=10;

        System.out.println(p2.name);
        System.out.println(c2.age);

        c2.show();
    }
}
