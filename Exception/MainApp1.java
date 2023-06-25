package Exception;

public class MainApp1 {
    public static void main(String[] args) {
        System.out.println("Stmt 1");
        System.out.println("Stmt 2");
        try{
            System.out.println(10/0);//Exception is occur here
        }catch (ArithmeticException a){
            System.out.println(a);
        }
        System.out.println("Stmt 3");
        System.out.println("Stmt 4");
    }
}
