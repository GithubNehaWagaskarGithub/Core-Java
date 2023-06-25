package String;

public class Program21 {
    public static void main(String[] args) {
        String str="Good Morning";
        System.out.println(str.endsWith("g"));
        System.out.println(str.endsWith("G"));
        System.out.println(str.endsWith("ing"));
        System.out.println(str.endsWith("Morning"));
        System.out.println(str.endsWith("MoRnInG"));
        System.out.println(str.endsWith("Good Morning"));
    }
}
