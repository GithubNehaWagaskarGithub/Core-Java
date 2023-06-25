package objectClass;

public class Master {
    public void display()
    {
        System.out.println("Display Method");
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Java";
    }
}
