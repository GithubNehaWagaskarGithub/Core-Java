package String;

public class Program18 {
    public static void main(String[] args) {
        String str="Good";
        System.out.println(str.lastIndexOf('G'));
        System.out.println(str.lastIndexOf('o'));
        System.out.println(str.lastIndexOf("Good"));//0 it checks the index of first character in the given string
        System.out.println(str.lastIndexOf('z'));//-1 character z is not present in String
        System.out.println(str.lastIndexOf("ood"));
        System.out.println(str.lastIndexOf('d'));

    }
}
