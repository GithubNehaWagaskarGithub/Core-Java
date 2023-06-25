package encapsulation;

public class Machine {
    String company="TATA";
    double price=80000;


    class Switch
    {
        void on()
        {
            System.out.println("Switch is On");
        }
        void off()
        {
            System.out.println("Switch is off");
        }
    }

    class Engine
    {
        void start()
        {
            System.out.println("Start Engine");
        }
        void stop()
        {
            System.out.println("Stop Engine");
        }
    }
}
