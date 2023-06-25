package objectClass;

public class MainApp7 {
    public static void main(String[] args) {
        String s1="10";
        String s2="20";
        System.out.println("Add s1+s2 : "+(s1+s2));

        double d1=Double.parseDouble(s1);  //Parsing
        double d2=Double.parseDouble(s2);  //Parsing

        System.out.println("Add d1+d2 : "+(d1+d2));

        double d3=99.80;
        String s=Double.toString(d3);
        System.out.println(s);

        char c='C';
        String ss=Character.toString(c);
        System.out.println(c);
    }
}
