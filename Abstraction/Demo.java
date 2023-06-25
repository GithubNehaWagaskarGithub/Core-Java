package Abstraction;

public abstract class Demo
{
   static String s1="Static Data Member";
   String s2="Non-Static Data Member";

   public abstract void display();

   public static void text()
   {
      System.out.println("Text Method");
   }
   public void show()
   {
      System.out.println("Show Method");
   }

   public Demo()
   {
      System.out.println("Demo Constructor");
   }

   static
   {
      System.out.println("Static Block");
   }

   {
      System.out.println("Non-Static Block");
   }
}
