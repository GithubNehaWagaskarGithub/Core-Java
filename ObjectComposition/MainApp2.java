package ObjectComposition;

public class MainApp2
{
    public static void main(String[] args)
    {
        System.out.println("Main Method Starts");
        Car c1=new Car();
        c1.e1.start();
        c1.driveCar();
        c1.f1.playMusic();
        c1.e1.stop();
        c1.stopCar();
        c1.f1.stopMusic();
        System.out.println("Main Method Ends");
    }
}
