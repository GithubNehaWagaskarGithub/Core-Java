package Multi_Threading;

public class MainApp1 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        d1.start();
        d2.start();//Start() is used for to start the execution of thread.
    }
}
