package Multi_Threading;

public class Sample implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<7;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("---------------------");
    }
}
