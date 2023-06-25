package ObjectComposition;

public class Car
{
    Engine e1=new Engine();
    FmRadio f1=new FmRadio();
    void driveCar()
    {
        System.out.println("Driving car");
    }
    void stopCar()
    {
        System.out.println("Stop car");
    }
}
