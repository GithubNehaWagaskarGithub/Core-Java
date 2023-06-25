package generalizarion;

public class MainApp1 {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.drive();
        b1.type();
        Car c1=new Car();
        c1.drive();
        c1.type();
        ElectricCar e1=new ElectricCar();
        e1.drive();
        e1.type();
    }
}
