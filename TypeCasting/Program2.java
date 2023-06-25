package TypeCasting;

public class Program2 {
    public static void main(String[] args) {
        long a=456782345678l;
        int b=(int)a;
        System.out.println(a);
        System.out.println(b);

        int a1=123456789;
        short b1=(short)a1;
        System.out.println(a1+" a3");
        System.out.println(b1+" b3");

        short a2=128;
        byte b2=(byte)a2;
        System.out.println(a2);
        System.out.println(b2);

        short a3=11000;
        byte b3=(byte)a3;
        System.out.println(a3);
        System.out.println(b3);

        short b4=(short)32768;
        System.out.println(b4);
    }
}
