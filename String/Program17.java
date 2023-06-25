package String;

public class Program17 {
    public static void main(String[] args) {
        String str = "Good";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('z'));//-1 character z is not present in String
        System.out.println(str.indexOf("Good"));//0 it checks the index of first character in the given string
        System.out.println(str.indexOf('G'));
        System.out.println(str.indexOf('d'));
        //System.out.println(str.indexOf("good"));
    }
}