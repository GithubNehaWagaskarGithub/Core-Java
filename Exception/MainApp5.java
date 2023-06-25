package Exception;

public class MainApp5 {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int i=10;
        int j=0;
        try{
            int d=i/j;
            System.out.println(d);
        }catch (Exception e){
            System.out.println(10/(j+2));
        }
        System.out.println("Program Ends");
    }
}
