package TypeCasting;

public class MainApp4 {
    public static void main(String[] args) {
        Master2 m1=new Central2();
        //Master2 m2=new Central2();
        Central2 c1=(Central2)m1;
        //Central2 c2=(Central2)m2;

        c1.show();
        c1.display();
        //c2.display();
        //c2.show();
    }
}
