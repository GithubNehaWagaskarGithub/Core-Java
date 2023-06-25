package encapsulation;

public class MainApp4 {
    public static void main(String[] args) {
        Machine m1=new Machine();
        System.out.println("Company Name :"+m1.company);
        System.out.println("Price :"+m1.price);

        Machine.Switch s1=m1.new Switch();
        s1.on();

        Machine.Engine e1=m1.new Engine();
        e1.start();
        e1.stop();

        s1.off();
    }
}
