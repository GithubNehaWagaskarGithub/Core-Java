package Polymorphisms;

public class MainApp2 {
    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.shape();
        Shape s2=new Shape();
        s2.shape();
        Circle c1=new Circle();
        c1.shape();
        Rectangle r1=new Rectangle();
        r1.shape();
    }
}
