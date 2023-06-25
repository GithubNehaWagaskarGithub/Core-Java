package Multi_Threading;

public class MainApp3 {
    public static void main(String[] args) {
        Master m1=new Master();
        Master m2=new Master();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        t1.start();
        t1.stop();//Stop() is used for to explicitly stop the execution of thread.
        t2.start();
    }
}
