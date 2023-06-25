package objectClass;

public class MainApp4 {
    public static void main(String[] args) {
        String s1="Neha";
        String s2="neha";
        String s3="Neha";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s2));// .equals method will check the hashcode value
                                            //both hashCode Value is different because of that .equals method will return false
        System.out.println(s1.equals(s3));//both hashCode Value is same because of that .equals method will return true
    }
}
