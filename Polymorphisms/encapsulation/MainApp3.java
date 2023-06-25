package encapsulation;

public class MainApp3 {
    public static void main(String[] args) {
        Bike b1=new Bike();
        System.out.println("Company Name :"+b1.company);
        System.out.println("Price :"+b1.price);

        Bike.Engine e1= b1.new Engine();
        e1.start();

        Bike.Tyres t1= b1.new Tyres();
        System.out.println("Tyres Type :"+t1.type);
    }
}
