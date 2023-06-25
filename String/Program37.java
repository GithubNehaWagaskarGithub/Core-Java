package String;

public class Program37 {
    public static void main(String[] args) {
        String str="CORE JAVA";
        String str2;
        System.out.println("Original String is :"+str);
        String str1=str.replace('O','*');
        System.out.println("Replaced String is str1 :"+str1);
        System.out.println("Replaced String of str2 :"+ (str2=str.replace('A','*')));
        //System.out.println(System.identityHashCode(str));
        //System.out.println(System.identityHashCode(str1));
        //System.out.println(System.identityHashCode(str2));
    }
}
