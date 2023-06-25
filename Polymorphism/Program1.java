package Polymorphism;

public class Program1 {
    public void login(String emailId,int  password)
    {
        if(emailId.contains("@") && password==1234)
        {
            System.out.println("Login Successfully");
        }
        else
        {
            System.out.println("Login Unsuccessfully");
        }

    }
    public void login(int phNo,int password)
    {
        if(phNo==1234567890 && password==1234)
        {
            System.out.println("Login Successfully");
        }
        else
        {
            System.out.println("Login Unsuccessfully");
        }
    }

}
