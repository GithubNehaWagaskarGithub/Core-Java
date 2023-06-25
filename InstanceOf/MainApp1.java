package InstanceOf;

public class MainApp1 {
    public static void main(String[] args) {
        Master m1=new Master();
        Central c1=new Central();

        Master m2=new Central();
        Central c2=(Central) m2;

        System.out.println(m2 instanceof Central);
        System.out.println(m1 instanceof Central);
        System.out.println(c2 instanceof Central);
        System.out.println(m2 instanceof Master);
        System.out.println(m1 instanceof Master);
        System.out.println(c1 instanceof Central);

    }
}
