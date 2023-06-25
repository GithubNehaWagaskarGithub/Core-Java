package SuperKeyword;

public class Central extends Sample{
    String className="Central";
    int a=30;

    public void display()
    {
        System.out.println("Class Name1 :"+className);
        System.out.println("Class Name2 :"+super.className);
        //System.out.println("Class Name3 :"+super.className);
        System.out.println("A :"+a);
        System.out.println("B :"+super.a);
        //System.out.println("C :"+super.a);
    }
}
