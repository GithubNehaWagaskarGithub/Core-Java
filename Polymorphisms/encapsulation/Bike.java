package encapsulation;

public class Bike {
    String company="Ninja";
    double price=85000;

    class Engine
    {
        void start()
        {
            System.out.println("Start Engine");
            System.out.println("Bhrummm Bhrummm");
        }
    }
    class Tyres
    {
        String type="Tubeless Tyres";
    }
}
