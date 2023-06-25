package AnonymousClass;

public class MainApp1 extends Demo{

    public MainApp1() {
        super("demo");
        System.out.println("MainApp1 Constructor");
        }

        @Override
        public void display () {
            System.out.println("Display Method from MainApp1");
        }

    public static void main(String[] args) {
        new Demo("Demo class").display();
        new MainApp1().display();
    }
}
