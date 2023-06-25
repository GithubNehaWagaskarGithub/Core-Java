package Multi_Threading;

public class Master implements Runnable{// Runnable Interface is Functional Interface means which contain only one
                                        // abstract method which is Run Method.

    @Override
    public void run() {
        for (int i=0;i<7;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-----------------------");
    }
}
