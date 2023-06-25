package Multi_Threading;

public class Demo extends Thread{
        @Override
        public void run() {//Run() is used for to perform the specific operation.
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                try {
                    Thread.sleep(1500);//Sleep() is used for to suspend the thread for specific amount of time.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("--------------------");
        }
    }

