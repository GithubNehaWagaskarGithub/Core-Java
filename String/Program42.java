package String;

public class Program42 {
    public static void main(String[] args) {
        String str="Neha";
        String str1="Pandurang";
        String str2="Wagaskar";
        System.out.println(str+" "+str1+" "+str2);
        String str3=str.concat(str1).concat(str2);
        String str4=str.concat(" "+str1).concat(" "+str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
