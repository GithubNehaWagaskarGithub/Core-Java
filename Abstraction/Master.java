package Abstraction;

public abstract class Master {//abstract means Corona // why class is abstract because class contain abstract methods.
    public Master()
    {
        System.out.println("Constructor");
    }
    public abstract void display();//when we not provide implementation for methods then is treated as abstract methods.
                                   // for that we can declare semicolon (;) at the end of the method.
    public void show()
    {
        System.out.println("Show Method");
    }
}
