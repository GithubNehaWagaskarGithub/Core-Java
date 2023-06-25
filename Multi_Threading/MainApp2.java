package Multi_Threading;

public class MainApp2 {
    public static void main(String[] args) throws InterruptedException {//start,join,sleep,run,stop are the methods of
                                                                        // thread class not for Runnable interface
        Sample s1=new Sample();
        Sample s2=new Sample();
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);//so we can create a thread with the reference of that thread object.
        t1.start();
        t1.join();//join() is used for to allow any one thread to perform operation & others threads will be suspended.
        t2.start();

    }
}
